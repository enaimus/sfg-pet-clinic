package com.enaimus.sfgpetclinic.controllers;

import com.enaimus.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.websocket.server.PathParam;


@RequestMapping("/vets")
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService){
        this.vetService = vetService;
    }

    @GetMapping({"/", "", "/index", "/index.html", "/vets.html" })
    public String listVets (Model model){
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }

    @DeleteMapping("/{id}")
    public void deleteVet(@PathParam(value = "id") Long id){
        vetService.deleteById(id);
    }







}
