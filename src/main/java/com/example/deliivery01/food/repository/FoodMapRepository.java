package com.example.deliivery01.food.repository;

import com.example.deliivery01.food.domain.Food;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class FoodMapRepository {
    private Map<Long, Food> db = new HashMap<>();
    private static Long sequence = 0L;

    public FoodMapRepository() {
        this.db = new HashMap<>();
        this.sequence = 0L;
    }

    // 음식 등록
    public Food save(Food food) {
        food.setId(++sequence);
        db.put(sequence, food);
        return food;
    }

//    public Optional<Food> findById(Long id) {
//        return Optional.ofNullable(db.get(id));
//    }
    public Food findById(Long id) {
        return db.get(id);
    }

    // 이름으로 검색
    public Optional<Food> findById(String name) {
        return db.values().stream()
                .filter(food -> food.getName().equals(name))
                .findAny();
    }

    // 전체 조회
    public List<Food> findAll() {
        return new ArrayList<>(db.values());
    }

    // 음식 삭제
    public void delete(Long id) {
        db.remove(id);
    }

    /**
     * JPA는 엔티티 변경 감지 기능으로 데이터를 변경하기 때문에 따로 update 기능을 만들지 않아도 된다.
     */
}
