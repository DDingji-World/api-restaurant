package com.ddingji.apirestaurant.service;

import com.ddingji.apirestaurant.controller.dto.RandomRestaurantResponse;
import com.ddingji.apirestaurant.domain.Restaurant;
import com.ddingji.apirestaurant.respository.RestaurantRepository;
import com.ddingji.apirestaurant.utils.RandomHolder;
import java.util.List;
import java.util.Random;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository restaurantRepository;
    private final RandomHolder randomHolder;

    @Override
    public void getRestaurantListByCategory() {

    }

    @Override
    public RandomRestaurantResponse selectRandomRestaurantByCategory(String name) {
		List<Restaurant> all = restaurantRepository.findRestaurantsByCategoryName(name);
        return RandomRestaurantResponse.create(all.get(randomHolder.getRandomNumber(all.size())));
    }

    @Override
    public RandomRestaurantResponse selectRandomRestaurant() {
        List<Restaurant> all = restaurantRepository.findAllRestaurants();
        return RandomRestaurantResponse.create(all.get(randomHolder.getRandomNumber(all.size())));
    }


}
