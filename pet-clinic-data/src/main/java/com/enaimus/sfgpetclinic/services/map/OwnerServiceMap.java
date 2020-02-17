package com.enaimus.sfgpetclinic.services.map;

import com.enaimus.sfgpetclinic.models.Owner;
import com.enaimus.sfgpetclinic.services.CrudService;
import com.enaimus.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long>, OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.remove(object);
    }

    @Override
    public void deleteById(Long id) {
        super.removeById(id);

    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByFirstName(String firstName) {
        return null;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
