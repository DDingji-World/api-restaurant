package com.ddingji.apirestaurant.controller;

import com.ddingji.apirestaurant.controller.dto.RandomRestaurantResponse;
import com.ddingji.apirestaurant.domain.Restaurant;
import com.ddingji.apirestaurant.service.RestaurantService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class RestaurantController {

    private final RestaurantService restaurantService;

    @GetMapping
    public void getRestaurantListByCategory() {

    }

    @PostMapping("/restaurant")
    public ResponseEntity<RandomRestaurantResponse> selectRandomRestaurantByCategory(
            @RequestParam("category") String name) {
        RandomRestaurantResponse response = restaurantService.selectRandomRestaurantByCategory(
                name);
        return ResponseEntity.ok(response);
    }
    @PostMapping("/restaurant/all")
    public ResponseEntity<RandomRestaurantResponse> selectRandomRestaurant() {
        RandomRestaurantResponse response = restaurantService.selectRandomRestaurant();
        return ResponseEntity.ok(response);
    }

}
