package com.sistemaifnmg.sistemaifnmg.Controllers;

import com.sistemaifnmg.sistemaifnmg.Models.Contrato;
import com.sistemaifnmg.sistemaifnmg.Repository.ContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class IfnmgController {

    @Autowired
    private ContratoRepository cr;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

   @RequestMapping("/telaInicial")
    public String telaInicial(){

        return "telaInicial";
    }

    /*Contratos*/
    @RequestMapping(value="/novoContrato", method=RequestMethod.GET)
    public ModelAndView novoContrato(){
        ModelAndView modelAndView = new ModelAndView("novoContrato");
        modelAndView.addObject("contratoobj", new Contrato());
        return modelAndView;
    }

    @PostMapping("**/novoContrato")
    public ModelAndView novoContrato(@Valid Contrato contrato, BindingResult result){
        ModelAndView andView = new ModelAndView("novoContrato");
        if(result.hasErrors()){
            return andView;
        }
        cr.save(contrato);
        Iterable<Contrato> contratoIt = cr.findAll();
        andView.addObject("contratos", contratoIt);
        andView.addObject("contratoobj", new Contrato());

        return andView;
    }

    @RequestMapping(value="/buscarContrato", method=RequestMethod.GET)
    public String buscarContrato(){

        return "buscarContrato";
    }

    @RequestMapping(value="/buscarContrato", method=RequestMethod.POST)
    public ModelAndView buscarContrato(@RequestParam("objbusca") String objbusca){
        ModelAndView modelAndView = new ModelAndView("buscarContrato");
        modelAndView.addObject("contratos", cr.findByObjeto(objbusca));
        modelAndView.addObject("contratoobj", new Contrato());
        return modelAndView;
    }
    @RequestMapping(value="/editarcontrato/{idcontrato}", method=RequestMethod.GET)
    public ModelAndView editarContrato(@PathVariable("idcontrato") Long idcontrato){
        Optional<Contrato> contrato = cr.findById(idcontrato);
        ModelAndView modelAndView = new ModelAndView("novoContrato");
        modelAndView.addObject("contratoobj",contrato.get());
        return modelAndView;
    }



   @GetMapping("/excluircontrato/{idcontrato}")
    public ModelAndView excluirContrato(@PathVariable("idcontrato") Long idcontrato){
        cr.deleteById(idcontrato);
        ModelAndView modelAndView = new ModelAndView("buscarContrato");
        modelAndView.addObject("contratoobj",cr.findAll());
        modelAndView.addObject("contratoobj", new Contrato());
        return modelAndView;
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
