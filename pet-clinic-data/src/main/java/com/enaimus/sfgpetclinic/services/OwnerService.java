package com.enaimus.sfgpetclinic.services;

import com.enaimus.sfgpetclinic.models.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(long id);

    Owner findByLastName (String lastName);

    Owner save (Owner owner);

    Set<Owner> findByAll();
}
