package ru.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Ivanov Ivan Ivanovich");
        student.setGroup("МO-129");
        student.setDate("22.08.2024");
        System.out.println("student " + student.getFio() + " из группы "
                + student.getGroup() + " поступил в унивeрситет " + student.getDate());
    }
}
