package com.nitrodragon.beans;

import com.google.common.base.MoreObjects;

public class Car {

    private long Id;
    private String Name;
    private int Price;

    public Car(long Id, String Name, int Price) {
        this.Id = Id;
        this.Name = Name;
        this.Price = Price;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(Car.class)
                .add("id", Id)
                .add("name", Name)
                .add("price", Price)
                .toString();
    }
}
