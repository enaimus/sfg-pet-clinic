package com.enaimus.sfgpetclinic.services;

import com.enaimus.sfgpetclinic.models.Pet;

import java.util.Set;

public interface PetService {

    Pet findById (long id);

    Pet save (Pet pet);

    Set<Pet> findAll();

}
