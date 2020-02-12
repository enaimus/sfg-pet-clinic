package com.enaimus.sfgpetclinic.services.map;

import com.enaimus.sfgpetclinic.models.Vet;
import com.enaimus.sfgpetclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
    super.remove(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.removeById(aLong);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
