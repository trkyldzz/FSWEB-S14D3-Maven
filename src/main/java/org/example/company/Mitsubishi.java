package org.example.company;

public class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> Mitsubishi engine starting";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> Mitsubishi accelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> Mitsubishi braking";
    }
}