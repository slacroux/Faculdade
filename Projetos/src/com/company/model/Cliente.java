package com.company.model;

public class Cliente {

    private int codigo = 100;
    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Cliente(Animal animal) {
        this.codigo++;
        this.animal = animal;
    }

}
