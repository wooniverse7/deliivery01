package com.example.deliivery01.food.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Food {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String name; // 음식 이름

    @Column(length = 100, nullable = false)
    private String type; // 음식 종류

    @Column(length = 255, nullable = false)
    private String description;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private int store_id;

    @Column(length = 255, nullable = false)
    private String main_image_url;

    @Enumerated(value = EnumType.STRING)
    @Column(length = 20, nullable = false)
    private FoodStatus foodStatus = FoodStatus.FOOD_FOR_SALE;

    @Column(nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(nullable = false, name = "LAST_MODIFIED_AT")
    private LocalDateTime modifiedAt = LocalDateTime.now();

    public Food(String name, String type, String description, int price) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
    }

    public enum FoodStatus {
        FOOD_FOR_SALE("판매중"),
        FOOD_SOLD_OUT("매진");

        @Getter
        private String status;

        FoodStatus(String status) {
            this.status = status;
        }
    }
}
