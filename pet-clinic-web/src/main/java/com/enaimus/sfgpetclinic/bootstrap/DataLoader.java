package com.enaimus.sfgpetclinic.bootstrap;

import com.enaimus.sfgpetclinic.models.Owner;
import com.enaimus.sfgpetclinic.models.Vet;
import com.enaimus.sfgpetclinic.services.OwnerService;
import com.enaimus.sfgpetclinic.services.VetService;
import com.enaimus.sfgpetclinic.services.map.OwnerServiceMap;
import com.enaimus.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private OwnerService ownerService;
    private VetService vetService;


    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);
        System.out.println("Owners loaded");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);


        System.out.println("Vets loaded");



    }

}