package com.chenery.tachetastic.example;

import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class Example {

    List<Item> items() {
        return Arrays.asList(
                new Item("Item 1", "$19.99", Arrays.asList(new Feature("New!"), new Feature("Awesome!"))),
                new Item("Item 2", "$29.99", Arrays.asList(new Feature("Old."), new Feature("Ugly.")))
        );
    }

    static class Item {
        Item(String name, String price, List<Feature> features) {
            this.name = name;
            this.price = price;
            this.features = features;
        }

        String name, price;
        List<Feature> features;
    }

    public static class Feature {

        public Feature(String description) {
            this.description = description;
        }

        String description;
    }
}
