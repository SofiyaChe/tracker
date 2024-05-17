package ru.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] newItems = new Item[size];
        for (int index = 0; index < newItems.length; index++) {
            Item item = items[index];
            if (item != null) {
                newItems[index] = item;
            }
        }
        return Arrays.copyOf(newItems, size);
    }

    public Item[] findByName(String key) {
        Item[] newItems = new Item[size];
        int count = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (items[index].getName().equals(key)) {
                newItems[count] = item;
                count++;
            }
        }
        return Arrays.copyOf(newItems, count);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}