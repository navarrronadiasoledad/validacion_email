package com.example.demo.controllerImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.example.demo.Repository.EmailRepository;
import com.example.demo.controller.EmailsController;
import com.example.demo.entities.Email;
import com.example.demo.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmailsControlerImpl implements EmailsController {
    @Autowired
    EmailService emailService;
   private int contador=0;
/*
    // http://localhost:8888/customers (GET)
    @RequestMapping(value = "/allemail", method = RequestMethod.GET, produces = "application/json")
      //  public List<Email> getEmail() {
        return emailService.findAllEmail();
    }

*/
  //  public List<Email> getEmailInva() {return null;    }

    @PostMapping("/email/validation/{email}")
    public Boolean validaEmail( Email email) {
        contador++;
        if (emailService.comprobarEmail()==true){
            emailService.saveEmail(email);
        }else {

        }


     return true;
    }




}