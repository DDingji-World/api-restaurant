package com.ddingji.apirestaurant.service;

import java.util.List;

import com.ddingji.apirestaurant.controller.dto.RandomRestaurantResponse;
import com.ddingji.apirestaurant.controller.dto.RestaurantListResponse;

public interface RestaurantService {

	List<RestaurantListResponse> getRestaurantListByCategory(String name);

	RandomRestaurantResponse selectRandomRestaurantByCategory(String name);

	RandomRestaurantResponse selectRandomRestaurant();

	List<RestaurantListResponse> getRestaurantList();



}
