package com.ddingji.apirestaurant.service;

import com.ddingji.apirestaurant.controller.dto.RestaurantResponse;
import com.ddingji.apirestaurant.domain.CategoryType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@SpringBootTest
public class getRestaurantListTest {

	@Autowired
	private RestaurantService restaurantService;

	@Test
	@Transactional
	void getRestaurantsWhenCategoryIsAll() {
		List<RestaurantResponse> restaurants = restaurantService.getRestaurants(CategoryType.ALL);
		restaurants.forEach(System.out::println);
	}


	@Test
	@Transactional
	void getRestaurantsWhenCategoryIsSpecific() {
		List<RestaurantResponse> restaurants = restaurantService.getRestaurants(CategoryType.KOREAN);
		restaurants.forEach(System.out::println);
	}
}
