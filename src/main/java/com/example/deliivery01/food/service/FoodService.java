package com.example.deliivery01.food.service;

import com.example.deliivery01.food.domain.Food;
import com.example.deliivery01.food.dto.FoodRequest;
import com.example.deliivery01.food.dto.FoodResponse;
import com.example.deliivery01.food.repository.FoodMapRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoodService {

    private final FoodMapRepository foodMapRepository;

    public FoodService(FoodMapRepository foodMapRepository) {
        this.foodMapRepository = foodMapRepository;
    }

//    public FoodResponse postFood(Food food) {
//        return new FoodRequest(food);
//    }

    public FoodResponse findFood(Long foodId) {
        Food food = foodMapRepository.findById(foodId);
        return FoodResponse.from(food);
    }

    public List<FoodResponse> findAllFood() {
        List<Food> foods = foodMapRepository.findAll();

        return foods.stream()
                .map(FoodResponse::from)
                .collect(Collectors.toList());
    }

    public void deleteFood(Long foodId) {
        foodMapRepository.delete(foodId);
    }
}
