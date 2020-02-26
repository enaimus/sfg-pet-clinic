package com.enaimus.sfgpetclinic.services.map;

import com.enaimus.sfgpetclinic.models.Owner;
import com.enaimus.sfgpetclinic.services.CrudService;
import com.enaimus.sfgpetclinic.services.OwnerService;
import com.enaimus.sfgpetclinic.services.PetService;
import com.enaimus.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long>, OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner save(Owner object) {
        if (object == null) {
            return null;
        } else {
            object.getPets().forEach(
                    pet -> {
                        if (pet.getPetType() != null) {
                            if (pet.getPetType().getId() == null) {
                                pet.setPetType(petTypeService.save(pet.getPetType()));
                            }
                        } else {
                            throw new RuntimeException("PetType cant be null");
                        }

                        if(pet.getId() == null){
                            pet.setId(petService.save(pet).getId());
                        }

                    });
        }


        return super.save(object);
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
