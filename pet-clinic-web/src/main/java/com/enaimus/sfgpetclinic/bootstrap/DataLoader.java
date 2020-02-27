package com.enaimus.sfgpetclinic.bootstrap;

import com.enaimus.sfgpetclinic.models.*;
import com.enaimus.sfgpetclinic.services.OwnerService;
import com.enaimus.sfgpetclinic.services.PetTypeService;
import com.enaimus.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        if (petTypeService.findAll().isEmpty()) {
            loadData();
        }
    }

    private void loadData() {
        PetType petType1 = new PetType();
        petType1.setName("Dog");

        PetType petType = new PetType();
        petType.setName("Cat");


        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setPets(new HashSet<>());

        Pet pet = new Pet();
        pet.setPetType(petType);
        pet.setBirthDate(LocalDate.now());
        pet.setOwner(owner1);

        owner1.getPets().add(pet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");


        Pet pet2 = new Pet();
        pet2.setPetType(petType1);
        pet2.setBirthDate(LocalDate.now());
        pet2.setOwner(owner2);
        owner2.setPets(new HashSet<>());
        owner2.getPets().add(pet2);
        ownerService.save(owner2);
        System.out.println("Owners loaded");

        Specialty specialtyMammal = new Specialty();
        specialtyMammal.setDescription("Mammals");

        Specialty specialtyBirds = new Specialty();
        specialtyBirds.setDescription("Birds");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialty().add(specialtyMammal);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vet2.getSpecialty().add(specialtyBirds);

        vetService.save(vet2);

        System.out.println("Vets loaded");
    }

}
