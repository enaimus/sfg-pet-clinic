package com.enaimus.sfgpetclinic.services.map;

import com.enaimus.sfgpetclinic.models.Vet;
import com.enaimus.sfgpetclinic.services.CrudService;
import com.enaimus.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long>, VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
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
