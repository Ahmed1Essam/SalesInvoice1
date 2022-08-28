/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jhin
 */
public class Header {
    private int num;
    private String name;
    private Date date;
    private ArrayList<item> items;

    public Header(int num, String name, Date date) {
        this.num = num;
        this.name = name;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<item> getItems() {
        if(items == null){
            items = new ArrayList();
        }
        return  items;
    }

    @Override
    public String toString() {
        return "Header{" + "num=" + num + ", name=" + name + ", date=" + date + ", items=" + items + '}';
    }

        public double getTotal ()
{
    double total=0.0;
    
    for (Item    item : getItems()){
        total += item.getTotal();
    }
    return total;
}
}
