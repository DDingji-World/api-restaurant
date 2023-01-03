package com.ddingji.apirestaurant.service;

import com.ddingji.apirestaurant.controller.dto.RestaurantInfoResponse;
import com.ddingji.apirestaurant.controller.dto.RestaurantResponse;
import com.ddingji.apirestaurant.domain.CategoryType;
import com.ddingji.apirestaurant.exception.RestaurantErrorCode;
import com.ddingji.apirestaurant.exception.RestaurantException;
import org.junit.jupiter.api.Assertions;
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
		List<RestaurantResponse> restaurants = restaurantService.getRestaurants(null);
		restaurants.forEach(System.out::println);
	}

	@Test
	@Transactional
	void getRestaurantsWhenCategoryIsSpecific() {
		List<RestaurantResponse> restaurants = restaurantService.getRestaurants(CategoryType.KOREAN);
		restaurants.forEach(System.out::println);
	}

	@Test
	@Transactional
	void getRestaurantById() {
		RestaurantInfoResponse response = restaurantService.getRestaurantById(1L);
		Assertions.assertNotNull(response);
	}

	@Test
	@Transactional
	void getRestaurantByInvalidId() {
		Assertions.assertEquals(RestaurantErrorCode.NOT_FOUND_RESTAURANT_DATA_BY_ID.getErrorMessage(),
				Assertions.assertThrows(RestaurantException.class,
					() -> restaurantService.getRestaurantById(100000000000000000L)).getErrorMessage());
	}
}
