package com.hatbazar.domains;

/**
 * Created with IntelliJ IDEA.
 * User: bsejawal
 * Date: 6/21/13
 * Time: 8:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class Item {
    int id;
    String name;
    String category;
    int addedBy; // User who added this item
    double price;
    boolean status;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(int addedBy) {
        this.addedBy = addedBy;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
