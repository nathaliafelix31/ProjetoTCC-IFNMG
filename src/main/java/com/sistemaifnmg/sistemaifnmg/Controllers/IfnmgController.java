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
    @RequestMapping(value="/novoContrato", method=RequestMethod.GET)
    public String novoContrato(){

        return "novoContrato";
    }
    @RequestMapping(value="/buscarContrato", method=RequestMethod.GET)
    public String buscarContrato(){

        return "buscarContrato";
    }
    @RequestMapping(value="/aVencer", method=RequestMethod.GET)
    public String aVencer(){

        return "aVencer";
    }
    @RequestMapping(value="/vencidos", method=RequestMethod.GET)
    public String vencidos(){

        return "vencidos";
    }
}
