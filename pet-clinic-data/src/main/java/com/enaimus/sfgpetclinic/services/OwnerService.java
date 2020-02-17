package com.enaimus.sfgpetclinic.services;

import com.enaimus.sfgpetclinic.models.Owner;


public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByFirstName (String firstName);
    Owner findByLastName (String lastName);

}
