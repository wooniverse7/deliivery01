package com.example.deliivery01.food.controller;

import com.example.deliivery01.food.dto.FoodResponse;
import com.example.deliivery01.food.service.FoodService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;
import java.util.List;

@RestController
@RequestMapping("/api/foods")
public class FoodController {

    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

//    @PostMapping("/foods")
//    public FoodResponse postFood(@RequestBody Food food){
//        foodService.
//    }

    @GetMapping("/foods")
    public FoodResponse findFood(@PathVariable("food-id") @Valid @Positive Long foodId) {
        return foodService.findFood(foodId);
    }

    @GetMapping("/foods")
    public List<FoodResponse> findAllFood() {
        return foodService.findAllFood();
    }

    @DeleteMapping("/{food-id}")
    public void deleteFood(@PathVariable("food-id") Long foodId){
        foodService.deleteFood(foodId);
    }
}
