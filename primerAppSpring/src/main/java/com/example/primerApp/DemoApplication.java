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



import org.json.*;
//@RestController
@Controller
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/index")
    String home(Model modelo) {
        Test test=new Test();
        modelo.addAttribute("test", test);
        return "index";
        
        
        //JSONArray myJson = new JSONArray("[123,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]");
        //return String.valueOf(myJson.get(0));
        //return String.valueOf("<h1>Hello World</h1>");
    }


    @PostMapping("/result")
    String sumbit(Model modelo,

    @RequestParam String nombre,
    @RequestParam String apellido_Pat,
    @RequestParam String apellido_Mat,
    @RequestParam String fecha_Nacimiento,
    @RequestParam String telefono,
    @RequestParam String correo,
    @RequestParam String contrasena,
    @RequestParam String tipo,
    @RequestParam String delegacion,
    @RequestParam String colonia,
    @RequestParam String calle,
    @RequestParam String numExt,
    @RequestParam String numInt
    ) {
        Cuenta cuenta=new Cuenta(contrasena, tipo, nombre,apellido_Pat,apellido_Mat,fecha_Nacimiento,Integer.valueOf(telefono),correo,"amex","sopa",200);
        Direccion persona=new Direccion( 
            delegacion,colonia,calle,numExt,numInt,
            nombre,apellido_Pat,apellido_Mat,fecha_Nacimiento,Integer.valueOf(telefono),correo);


        cuenta.mostrarDatos();
        persona.mostrarDatos();
        return "result";
    }
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
