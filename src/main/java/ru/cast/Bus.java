package ru.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("автобус двигается по скоростным трассам");
    }

    @Override
    public void stop() {
        System.out.println("автобус останавливается на остановке");
    }
}
