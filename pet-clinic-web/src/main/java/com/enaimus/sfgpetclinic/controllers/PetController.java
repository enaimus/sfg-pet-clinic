package com.enaimus.sfgpetclinic.controllers;

import com.enaimus.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pets")
@Controller
public class PetController {



        private final PetService petService;

        public PetController(PetService petService){
            this.petService = petService;
        }

        @GetMapping({"/", "", "index", "index.html"})
        public String listVets (Model model){
            model.addAttribute("pets", petService.findAll());
            return "pets/index";
        }
}
