package com.enaimus.sfgpetclinic.controllers;

import com.enaimus.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.websocket.server.PathParam;


@RequestMapping("/vet")
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService){
        this.vetService = vetService;
    }

    @GetMapping
    public String findAll(Model mode){
        return "vet/list";
    }

    @DeleteMapping("/{id}")
    public void deleteVet(@PathParam(value = "id") Long id){
        vetService.deleteById(id);
    }







}
