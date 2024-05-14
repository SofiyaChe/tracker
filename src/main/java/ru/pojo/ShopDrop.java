package ru.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = 0; i < products.length; i++) {
            if (index == i) {
                while (index != products.length - 1) {
                    products[index] = products[index + 1];
                    index++;
                }
                products[products.length - 1] = null;
            }
        }
        return products;
    }
}

