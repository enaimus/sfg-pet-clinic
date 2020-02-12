package com.enaimus.sfgpetclinic.services;

import com.enaimus.sfgpetclinic.models.Vet;

import java.util.Set;

public interface VetService {
    Vet findById (long id);

    Vet save (Vet pet);

    Set<Vet> findAll();

}
