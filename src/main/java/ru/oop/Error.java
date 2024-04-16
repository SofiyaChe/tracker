package ru.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.message = message;
        this.status = status;
    }

    public void printInfo() {
        System.out.println("Активность: " + active);
        System.out.println("Сообщение: " + message);
        System.out.println("Статус: " + status);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error error1 = new Error(true, 1, "Message1");
        Error error2 = new Error(false, 2, "Message2");
        error.printInfo();
        error1.printInfo();
        error2.printInfo();
    }
}
