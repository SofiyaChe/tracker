package ru.cast;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println("самолет летает по воздуху");
    }

    @Override
    public void stop() {
        System.out.println("самолет приземляется");
    }
}
