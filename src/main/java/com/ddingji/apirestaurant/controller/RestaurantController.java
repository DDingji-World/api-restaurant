package com.ddingji.apirestaurant.controller;

import com.ddingji.apirestaurant.controller.dto.RestaurantInfoResponse;
import com.ddingji.apirestaurant.controller.dto.RestaurantResponse;
import com.ddingji.apirestaurant.domain.CategoryType;
import com.ddingji.apirestaurant.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class RestaurantController {

    private final RestaurantService restaurantService;

    @GetMapping("/restaurants")
    @ResponseStatus(HttpStatus.OK)
    public List<RestaurantResponse> getRestaurants(@RequestParam(name = "category", required = false) CategoryType categoryType) {
        return restaurantService.getRestaurants(categoryType);
    }

    @GetMapping("/restaurant/{id}")
    @ResponseStatus(HttpStatus.OK)
    public RestaurantInfoResponse getRestaurantById(@PathVariable Long id) {
        return restaurantService.getRestaurantById(id);
    }
}
