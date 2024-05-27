package ru.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Go");
    }

    @Override
    public void passangers(int amount) {
        System.out.println(amount + " people on board.");
    }

    @Override
    public double fillIn(double fuel) {
        double price = 100.5;
        return price * fuel;
    }
}
