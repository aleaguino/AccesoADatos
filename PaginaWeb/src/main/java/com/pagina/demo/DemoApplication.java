package com.pagina.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
        @GetMapping("/plantillal")
        public String pagina(){
            return "plantilla";
        }
        @GetMapping("/plantilla2")
        public String tabla(){
            return "plantilla2";
        }

}
