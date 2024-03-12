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
    @GetMapping("/categories/adultos")
    @Secured("ROLE_ADULT")
    public String adultos(){
        System.out.println("entra a la categoria de adultos");
        return "adultos";
    }
    @GetMapping("/categories/economia")
    @Secured("ROLE_ADULT")
    public String economia(){
        System.out.println("entra a la categoria de economía");
        return "economia";
    }
    @GetMapping("/categories/guerra")
    @Secured("ROLE_ADULT")
    public String guerra(){
        System.out.println("entra a la categoria de guerra");
        return "guerra";
    }
    @GetMapping("/categories/caricaturas")
    @Secured({"ROLE_ADULT","ROLE_CHILD"})
    public String caricaturas(){
        System.out.println("entra a la categoria de caricaturas");
        return "caricaturas";
    }
    @GetMapping("/categories/familiares")
    @Secured({"ROLE_ADULT","ROLE_CHILD"})
    public String familiares(){
        System.out.println("entra a la categoria de familiares");
        return "familiares";
    }
    @GetMapping("/categories/animadas")
    @Secured({"ROLE_ADULT","ROLE_CHILD"})
    public String animadas(){
        System.out.println("entra a la categoria de animadas");
        return "animadas";
    }
    @GetMapping("/error")
    public String error(){
        return "error";
    }
}
