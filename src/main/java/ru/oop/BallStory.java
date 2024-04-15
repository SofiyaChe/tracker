package ru.oop;

public class BallStory {
    public static void main(String[] args) {
        Fox fox = new Fox();
        Hare hare = new Hare();
        Ball ball = new Ball();
        Wolf wolf = new Wolf();
        hare.tryEat(ball);
        wolf.tryEat(ball);
        fox.tryEat(ball);
    }
}
