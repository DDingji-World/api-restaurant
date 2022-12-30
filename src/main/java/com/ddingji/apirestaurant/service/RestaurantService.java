package com.ddingji.apirestaurant.service;

import com.ddingji.apirestaurant.controller.dto.RandomRestaurantResponse;

public interface RestaurantService {

	public void getRestaurantListByCategory();

	RandomRestaurantResponse selectRandomRestaurantByCategory(String name);

	RandomRestaurantResponse selectRandomRestaurant();



}
