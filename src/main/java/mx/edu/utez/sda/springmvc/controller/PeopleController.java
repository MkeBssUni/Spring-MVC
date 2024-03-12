package mx.edu.utez.sda.springmvc.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PeopleController {
    @GetMapping("/people/index")
    @Secured("ROLE_ADMIN")
    public String index(){
        System.out.println("entra al index de personas");
        return "people-index";
    }
}
