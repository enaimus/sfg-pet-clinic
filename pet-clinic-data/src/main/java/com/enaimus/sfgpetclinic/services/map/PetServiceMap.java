package com.enaimus.sfgpetclinic.services.map;

import com.enaimus.sfgpetclinic.models.Pet;
import com.enaimus.sfgpetclinic.services.CrudService;
import com.enaimus.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long>  implements CrudService<Pet, Long>, PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
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
