package ru.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Name1", 245);
        Book book2 = new Book("Name2", 239);
        Book book3 = new Book("Name3", 349);
        Book book4 = new Book("Clean code", 176);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
        System.out.println();
        Book tempBook = books[0];
        books[0] = books[3];
        books[3] = tempBook;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println(books[i]);
            }
        }
    }
}
