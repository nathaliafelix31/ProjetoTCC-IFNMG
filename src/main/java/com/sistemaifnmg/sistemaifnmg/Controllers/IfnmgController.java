package com.sistemaifnmg.sistemaifnmg.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IfnmgController {
    @RequestMapping(value="/telaInicial", method=RequestMethod.POST)
    public String form(){

        return "telaInicial";
    }
}
