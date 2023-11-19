package com.example.deliivery01.food.dto;

import com.example.deliivery01.food.domain.Food;

public class FoodRequest {

    private final String name;
    private final String type;
    private final String description;
    private final int price;

    public FoodRequest(String name, String type, String description, int price) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
    }


    public Food toEntity() {
        return new Food(name, type, description, price);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

}
