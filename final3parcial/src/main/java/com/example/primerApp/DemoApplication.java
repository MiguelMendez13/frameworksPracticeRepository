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

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.json.*;
//@RestController
@Controller
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/index")
    String home(ModelMap map) {
        map.addAttribute("saludo", "hola");
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

        return "result";
    }
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


    @RequestMapping("/regMed")
    String regMedico() {
        //System.out.println(sql.generarId());
        return "medicoRegistrar";

    }

    @PostMapping("/regMed")
    String regMedPost(Model modelo,@RequestParam String Nombre,@RequestParam String Apellido,@RequestParam String Esp){
        medico.agregarMedico(Nombre,Apellido,Esp);
        return "resultado";
    }






    @RequestMapping("/regPac")
    String regPac() {
        return "pacienteRegistrar";

    }

    @PostMapping("/regPac")
    String regPacPost(Model modelo, 
    @RequestParam String Nombre,
    @RequestParam String Apellido,
    @RequestParam String fecha,
    @RequestParam String Dom,
    @RequestParam String Tel,
    @RequestParam String Pais,
    @RequestParam String Mail,
    @RequestParam String Obs,

    @RequestParam String pago,
    @RequestParam String turno) {


        paciente.agregarPaciente(Nombre, Apellido, fecha, Dom, Tel, Mail, Obs, Pais, pago, turno);
        

        return "resultado";

    }

    @GetMapping("/borrarMed")
    String borrarMed(@RequestParam String id) {
        //System.out.println(id);
        medico.borrar(id);
        return "redirect:/mosMed";

    }

    
    @GetMapping("/editarMed")
    String edMed(Model model,@RequestParam String id) {

        model.addAttribute("id",id);
        model.addAttribute("idEd","/editarMedd");
        return "medicoEditar";

    }

    @PostMapping("/editarMedd")
    String edMedd(Model modelo,@RequestParam String id,@RequestParam String Nombre,@RequestParam String Apellido){
        
        /*System.out.println(id);
        System.out.println(Nombre);
        System.out.println(Apellido);
        medico.cambiar(Nombre, Apellido, id);*/
    
        return "redirect:/mosMed";
    }

    @GetMapping("/borrarPac")
    String borrarPac(@RequestParam String id) {
        //System.out.println(id);
        paciente.borrar(id);
        return "redirect:/mosPac";

    }
    
    @GetMapping("/editarPac")
    String edPac(Model model,@RequestParam String id) {

        model.addAttribute("id",id);
        model.addAttribute("idEd","/editarPacc");
        return "pacienteEditar";

    }

    @PostMapping("/editarPacc")
        String edPacc(Model modelo,@RequestParam String id,@RequestParam String Nombre,@RequestParam String Apellido,@RequestParam String fecha,@RequestParam String Dom,@RequestParam String Pais,@RequestParam String Tel,@RequestParam String Mail){
        System.out.println(id);
        System.out.println(Nombre);
        System.out.println(Apellido);
        System.out.println(fecha);
        System.out.println(Dom);
        System.out.println(Pais);
        System.out.println(Tel);
        System.out.println(Mail);


        paciente.cambiar(id, Nombre, Apellido, fecha, Dom, Pais, Tel, Mail);
    
        return "redirect:/mosPac";
    }
    
    
}
