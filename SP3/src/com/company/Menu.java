package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Menu {
    ArrayList<Pizza> Pizzaer;
    ArrayList<Order> Orders;
    String name;

    public Menu(String name) {
        this.name = name;
        this.Pizzaer = new ArrayList<>();
        Pizzaer.add(new Pizza("Margherita", new ArrayList<String>(Arrays.asList("Tomatsauce", "ost")),49));
        Pizzaer.add(new Pizza("Vesuvio", new ArrayList<String>(Arrays.asList("Tomatsauce", "ost", "skinke")), 59));
        Pizzaer.add(new Pizza("Hawaii", new ArrayList<String>(Arrays.asList("Tomatsauce", "ost", "skinke", "ananas")), 69));
        Pizzaer.add(new Pizza("Pepperoni", new ArrayList<String>(Arrays.asList("Tomatsauce", "ost", "Pepperoni")), 69));
        Pizzaer.add(new Pizza("Milano", new ArrayList<String>(Arrays.asList("Tomatsauce", "ost", "Pepperoni", "oksekød", "skinke")), 69));
        Pizzaer.add(new Pizza("Carbonara", new ArrayList<String>(Arrays.asList("Tomatsauce", "ost", "kødsauce", "løg")), 69));
    }

    public void addPizza(Pizza p) {
        Pizzaer.add(p);
    }

    @Override
    public String toString() {

        for (Pizza p: Pizzaer) {
            return "Pizzaer: " + "\n" + Pizzaer.toString() + "\n";
        }
        return null;
    }
}