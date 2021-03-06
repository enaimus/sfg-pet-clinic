package com.enaimus.sfgpetclinic.models;

import java.util.HashSet;
import java.util.Set;

public class Owner extends Person {

    private String address;
    private String telephone;
    private String city;
    private Set<Pet> pets;

    public Owner() {
        pets = new HashSet<>();
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
