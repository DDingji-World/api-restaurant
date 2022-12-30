package com.ddingji.apirestaurant.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.ddingji.apirestaurant.controller.dto.RestaurantListResponse;

@Transactional
@SpringBootTest
public class getRestaurantListTest {

	@Autowired
	private RestaurantService restaurantService;
	
	 @Test
	 @Transactional
	 public void getRestaurantListByCategory() {
	    	List<RestaurantListResponse> response = restaurantService.getRestaurantListByCategory("한식");
	    	for(RestaurantListResponse restaurant : response) {
	    		System.out.println(restaurant.name());
	    	}
	 }
	 
	 
	 @Test
	 @Transactional
	 public void getRestaurantList() {
	    	List<RestaurantListResponse> response = restaurantService.getRestaurantList();
	    	for(RestaurantListResponse restaurant : response) {
	    		System.out.println(restaurant.name());
	    	}
	 }
}
