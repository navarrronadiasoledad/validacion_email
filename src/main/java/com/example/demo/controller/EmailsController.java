package com.example.demo.controller;

import com.example.demo.entities.Email;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public interface EmailsController {


     Boolean validaEmail(Email email);
}
