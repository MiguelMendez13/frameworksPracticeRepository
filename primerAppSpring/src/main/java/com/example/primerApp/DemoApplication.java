package com.example.primerApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.json.*;
@RestController
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/")
    String home() {
        

        //JSONArray myJson = new JSONArray("[123,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]");
        //return String.valueOf(myJson.get(0));
        return String.valueOf("<h1>Hello World</h1>");
    }
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
