package com.example.app_coffee_thaiyen.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Beverage")
public class Beverage {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int Image;
    private String name;
    private String description;

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    private float price;
    private int quality;

    public Beverage() {
    }

    public Beverage(int id, int image, String name, String description, float price, int quality) {
        this.id = id;
        this.Image = image;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quality = quality;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}
