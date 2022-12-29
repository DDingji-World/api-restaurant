package com.ddingji.apirestaurant.respository;

import com.ddingji.apirestaurant.domain.Restaurant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
class RestaurantRepositoryTest {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Test
    @Transactional
    public void findAllRestaurant() {
        List<Restaurant> restaurants = restaurantRepository.findAll();
//        System.out.println(restaurants);
    }

    @Test
    @Transactional
    void findRestaurantById() {
        Restaurant restaurant = restaurantRepository.findById(1L).orElseThrow();
        System.out.println(restaurant.getCategories().get(0).getCategory());
    }

}