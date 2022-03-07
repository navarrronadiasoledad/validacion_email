package com.example.demo.service;

import com.example.demo.entities.Email;

public interface EmailService {
   // public List<Email> findAllEmail();

   // public Optional<Email> findEmailById(Long id);

    public Email saveEmail(Email emailNew);

    //public String deleteEmail(Long id);

   //public String updateEmail(Email emailNew);

    public Boolean comprobarEmail (String email);


}
