package com.enaimus.sfgpetclinic.services.map;

import com.enaimus.sfgpetclinic.models.Pet;
import com.enaimus.sfgpetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long>  implements CrudService<Pet, Long>{
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.remove(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.removeById(aLong);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

}
