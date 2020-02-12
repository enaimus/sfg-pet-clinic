package com.enaimus.sfgpetclinic.services;

import com.enaimus.sfgpetclinic.models.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName (String lastName);

}
