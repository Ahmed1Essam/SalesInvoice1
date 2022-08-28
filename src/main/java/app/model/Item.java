/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

import java.util.Date;

/**
 *
 * @author Jhin
 */
public class Item {
private Header inv;
private String name;
private int count;
private double price;

    public Item(Header inv, String name, int count, double price) {
        this.inv = inv;
        this.name = name;
        this.count = count;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Header getInv() {
        return inv;
    }

    public void setInv(Header inv) {
        this.inv = inv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", count=" + count + ", price=" + price + '}';
    }
    public double getTotal ()
{
    return count*price;
}
}