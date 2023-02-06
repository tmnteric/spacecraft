//en la clase controles se genera toda la logica del programa
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
    
    //inyectamos la dependencia Nave_espacial_service
    @Autowired
    private Nave_espacial_service naveEspacialService;
    
    //agegamos el path de la tura de inicio 
    @RequestMapping("/")
    public String inicio(Model model,@Param("palabraClave") String palabraClave){  
        var naveEspacial = naveEspacialService.listnaves(palabraClave);
        model.addAttribute("naveEspacial", naveEspacial);
        model.addAttribute("palapalabraClave", palabraClave);
        return "index";
    }
    //agegamos el path de la ruta de select la cual nos permite escoger uno de los tres tipos de naves
    @GetMapping("/select")
        public String select(nave_espacial nave_espacial){
        return "seleccion";
    }
    //agegamos el path /addLanzadera el cual nos permite crear la nave lanzadera
    @GetMapping("/addLanzadera")
    public String addLanzadera(nave_espacial nave_espacial){
        return "modifyLanzadera";
    }
    //agegamos el path /addNoTripulada el cual nos permite crear las naves no tripuladas
    @GetMapping("/addNoTripulada")
    public String addNoTripulada(nave_espacial nave_espacial){
        return "modifyNoTripulada";
    }
    //agegamos el path /addTripulada el cual nos permite crear las naves tripuladas
    @GetMapping("/addTripulada")
    public String addTripulada(nave_espacial nave_espacial){
        return "modifyTripulada";
    }
    //agegamos el path /guardar el cual nos guarda la informacion en la base de datos
    @PostMapping("/guardar")
    public String guardar(nave_espacial nave_espacial){
        naveEspacialService.guardar(nave_espacial);
        return "redirect:/";
    }
}
