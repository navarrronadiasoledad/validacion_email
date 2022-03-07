package com.example.demo.Repository;

import com.example.demo.entities.Email;
import org.springframework.data.jpa.repository.JpaRepository;
//import com.example.rest_jpa_sbdirec.entities.Email;


import java.util.Optional;

public interface EmailRepository extends JpaRepository<Email,Long> {
    Void save(Optional<Email> emailToUpdate);

}
