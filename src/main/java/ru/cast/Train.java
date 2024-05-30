package ru.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("поезд передвигается по рельсам");
    }

    @Override
    public void stop() {
        System.out.println("поезд останавливается на станциях");
    }
}
