package com.example.primerApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

//import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.json.*;
@RestController
//@Controller
@SpringBootApplication
public class mostrar {
    @RequestMapping("/mosMed")
    String mostrar() {

        return String.valueOf("<h1>Medicos<h1><br>"+medico.leer());
    }

    @RequestMapping("/mosPac")
    String mostrarPac() {
                return String.valueOf("<h1>Pacientes<h1><br>"+paciente.leer());
    }

    @RequestMapping("/mosPag")
    String mostrarPag() {

        return String.valueOf("<h1>Pagos<h1><br>"+paciente.leerPago());
    }


}
