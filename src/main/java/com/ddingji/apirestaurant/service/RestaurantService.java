package com.ddingji.apirestaurant.service;

import com.ddingji.apirestaurant.controller.dto.RestaurantResponse;
import com.ddingji.apirestaurant.domain.CategoryType;

import java.util.List;

public interface RestaurantService {

	List<RestaurantResponse> getRestaurants(CategoryType categoryType);

}
