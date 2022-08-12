package com.example.PaymentSystem;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Component
public class JwtUtil {
    @Value("${app.secret}")
    private String secret;

    public boolean validateToken(String token,String username){
        String usernameInToken = getUsername(token);
        return (usernameInToken.equals(username) && !isTokenExp(token));
    }

    public boolean  isTokenExp(String token){
        final Date expiration = getExpDate(token);
        return expiration.before(new Date());
    }



    public String getUsername(String  token){
        return getClaims(token).getSubject();
    }
    public Date getExpDate(String token)
    {
       return getClaims(token).getExpiration();
    }

    public Claims getClaims(String token){
        return Jwts.parser()
        .setSigningKey(secret)
                .parseClaimsJws(token)
                .getBody();

    }
    public String generateToken(String  username) {
        Map<String, Object> claims = new HashMap<>();
        return generateToken(claims, username);
    }

    public String generateToken( Map<String,Object> claims,String subject){
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(subject)
                .setIssuer("SJ")
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(30)))
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }
    }


