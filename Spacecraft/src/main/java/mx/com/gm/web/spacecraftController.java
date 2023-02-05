package mx.com.gm.web;

import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.nave_espacial;
import mx.com.gm.repository.Nave_espacial_repository;
import mx.com.gm.service.Nave_espacial_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class spacecraftController {
    
    @Autowired
    private Nave_espacial_service naveEspacialService;
    
    @RequestMapping("/")
    public String inicio(Model model,@Param("palabraClave") String palabraClave){
    //public String inicio(Model model){    
        var naveEspacial = naveEspacialService.listnaves(palabraClave);
        model.addAttribute("naveEspacial", naveEspacial);
        model.addAttribute("palapalabraClave", palabraClave);
        return "index";
    }
    @GetMapping("/select")
        public String select(nave_espacial nave_espacial){
        return "seleccion";
    }
    @GetMapping("/addLanzadera")
    public String addLanzadera(nave_espacial nave_espacial){
        return "modifyLanzadera";
    }
    @GetMapping("/addNoTripulada")
    public String addNoTripulada(nave_espacial nave_espacial){
        return "modifyNoTripulada";
    }
    @GetMapping("/addTripulada")
    public String addTripulada(nave_espacial nave_espacial){
        return "modifyTripulada";
    }
    @PostMapping("/guardar")
    public String guardar(nave_espacial nave_espacial){
        naveEspacialService.guardar(nave_espacial);
        return "redirect:/";
    }
}
