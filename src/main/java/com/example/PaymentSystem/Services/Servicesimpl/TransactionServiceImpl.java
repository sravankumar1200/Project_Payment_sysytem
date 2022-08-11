package com.example.PaymentSystem.Services.Servicesimpl;

import com.example.PaymentSystem.Model.*;
//import com.example.PaymentSystem.Model.TransactionDTO;
import com.example.PaymentSystem.Repository.*;
//import com.example.PaymentSystem.Services.Mappingservice;
import com.example.PaymentSystem.Services.TransactionServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service()
@Transactional
public class TransactionServiceImpl implements TransactionServices {
    private static Logger logger = LoggerFactory.getLogger(TransactionServiceImpl.class);

    @Autowired
    private TransactionRepository transactionRepository;
//@Autowired
   // private Customer customer;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private MessageRepository messageRepository;
    @Autowired
    private  BankRepository bankRepository;
    @Autowired
    private TransfertypeRepository transfertypeRepository;
    ;
   // @Autowired
    //private TransactionDTO transactionDTO;
   // private TransactionDTO transactionDTO;

    //private Bank bank;

    @Override
    public TransactionTBL SaveTransaction(TransactionDTO transactionDTO) {
logger.info("We are going to save data "+transactionDTO);
         TransactionTBL t=new TransactionTBL();
        //    TransactionDTO dto =new TransactionDTO();
        Message msg= messageRepository.findById("CORT").get();
        Transfertype ty= transfertypeRepository.findById("C").get();

            Customer c = customerRepository.findById(transactionDTO.getCustid()).get();
            logger.info("We have received  customer data "+c);
            Bank b= bankRepository.findById(transactionDTO.getBic()).get();
        logger.info("We have received data "+c);
        //TransactionTBL transaction=new TransactionTBL();

        //    transaction.setCustomer(c);

         //   transaction.setBank(b);
//transactionRepository.save(transaction);
            t.setCustomer(c);
            t.setBank(b);
            t.setAmount(transactionDTO.getAmount());
            t.setMessage(msg);
            t.setTransfertype(ty);

            if(transactionDTO.getAmount()<=c.getClearbalance()){
                // dto.setAmount(c.getClr_balance()-dto.getAmount());;
                c.setClearbalance(c.getClearbalance()-transactionDTO.getAmount());
                return transactionRepository.save(t);

            }
            else if(transactionDTO.getAmount()>c.getClearbalance() && c.getOverdraftflag().equals("yes")){
                c.setClearbalance(c.getClearbalance()-transactionDTO.getAmount());
                return transactionRepository.save(t);
            }
            else{
                c.setClearbalance(c.getClearbalance());
                return null;
            }




    }

    @Override
    public List<TransactionTBL> Getall() {
        return transactionRepository.findAll();
    }


}


