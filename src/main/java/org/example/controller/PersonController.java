package org.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/person")
public class PersonController {

    @GetMapping("/")
    public String person(){
        return "person";
    }

    @GetMapping("/addperson")
    public String addPerson(){
        return "addPerson";
    }

    @GetMapping("/editperson")
    public String editPerson(){
        return "editPerson";
    }

}
