package com.sistemaifnmg.sistemaifnmg.Controllers;

import com.sistemaifnmg.sistemaifnmg.Models.Contrato;
import com.sistemaifnmg.sistemaifnmg.Repository.ContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class IfnmgController {

    @Autowired
    private ContratoRepository cr;

    @RequestMapping(value="/telaInicial", method=RequestMethod.POST)
    public String form(){

        return "telaInicial";
    }

    /*Contratos*/
    @RequestMapping(value="/novoContrato", method=RequestMethod.GET)
    public String novoContrato(){
        return "novoContrato";
    }

    @RequestMapping(value="/novoContrato", method=RequestMethod.POST)
    public String novoContrato(@Valid Contrato contrato){

        cr.save(contrato);
        return "redirect:/novoContrato";
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
    /*Servidores*/
    /*Empenhos*/
}
