package com.example.demo.serviceImpl;

import com.example.demo.Repository.EmailRepository;
import com.example.demo.entities.Email;
import com.example.demo.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    EmailRepository emailRepository;


    @Override
    public Email saveEmail(Email emailNew) {
        int cont =0;
        if (emailNew != null) {
            cont ++;
            return emailRepository.save(emailNew);
        }
        return new Email();
    }
     @Override
    public Boolean comprobarEmail (String email) {
        Pattern pattern = Pattern.compile("^([0-9a-zA-Z]+[-._+&])*[0-9a-zA-Z]+@([-0-9a-zA-Z]+[.])+[a-zA-Z]{2,6}$");
        Matcher match = pattern.matcher(email);
        if(match.find()){
            System.out.println("correo valido");
            return true;
        }else{
            System.out.println("correo invalido");
            return false;
        }

    }

}
