package com.example.deliivery01.foods;

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
    private Long foodId;

    @Column(length = 100, nullable = false)
    private String foodName;

    @Column(length = 100, nullable = false)
    private String foodType;

    @Column(length = 255, nullable = false)
    private String description;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    private Integer store_id;

    @Column(length = 255, nullable = false)
    private String main_image_url;

    @Enumerated(value = EnumType.STRING)
    @Column(length = 20, nullable = false)
    private FoodStatus foodStatus = FoodStatus.FOOD_FOR_SALE;

    @Column(nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(nullable = false, name = "LAST_MODIFIED_AT")
    private LocalDateTime modifiedAt = LocalDateTime.now();

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
