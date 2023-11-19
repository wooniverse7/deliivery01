package com.example.deliivery01.food.dto;

import com.example.deliivery01.food.domain.Food;

public class FoodResponse {

    private final Long id;
    private final String name;
    private final String type;
    private final int price;

    public FoodResponse(Long id, String name, String type, int price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public static FoodResponse from(Food food) {
        return new FoodResponse(
                food.getId(),
                food.getName(),
                food.getType(),
                food.getPrice()
        );
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }
}
