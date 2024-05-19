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
            if (items[index] != null) {
                newItems[index] = items[index];
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

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            items[index] = item;
            return true;
        }
        return false;
    }
}