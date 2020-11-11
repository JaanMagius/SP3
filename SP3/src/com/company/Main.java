//Author: Andreas Weidekamp & Jaan Magius
package com.company;

import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        new KeyListenerExample();
        Menu menu = new Menu("Menu");
        System.out.println(menu.toString());
        Order order1 = new Order(menu.Pizzaer.get(0));
        Order order2 = new Order(menu.Pizzaer.get(1));
        Order order3 = new Order(menu.Pizzaer.get(2));
        Order order4 = new Order(menu.Pizzaer.get(3));
        try{
            FileWriter orders = new FileWriter("Data.txt");
            orders.write(order1.toString());
            orders.write(order2.toString());
            orders.write(order3.toString());
            orders.write(order4.toString());
            orders.close();
        } catch(Exception e){
            System.out.println(e);
            System.out.println("Saved.");
        }
    }
}