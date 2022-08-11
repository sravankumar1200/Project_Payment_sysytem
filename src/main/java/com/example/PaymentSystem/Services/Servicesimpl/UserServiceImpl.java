package com.example.PaymentSystem.Services.Servicesimpl;

import com.example.PaymentSystem.Model.User;
import com.example.PaymentSystem.Repository.UserRepository;
import com.example.PaymentSystem.Services.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements Userservice, UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    @Transactional()
    public User SaveUser(User user) {
        user.setPwd(passwordEncoder.encode(user.getPwd()));
        return userRepository.save(user);
    }

    @Override
    @Transactional()
    public Optional<User> findByUsername(String username) {

        return userRepository.findByUsername(username);
    }

    @Override
    @Transactional()
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User>opt= findByUsername( username);
        if(opt.isEmpty())
        {
            throw  new UsernameNotFoundException("user not exist");
        }
        User user1=opt.get();
        return new org.springframework.security.core.userdetails.User(username,user1.getPwd(),
                user1.getRoles().stream().
                        map(role-> new SimpleGrantedAuthority(role)).collect(Collectors.toList())
        );
    }
}
