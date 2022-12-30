package com.ddingji.apirestaurant.service;

import com.ddingji.apirestaurant.controller.dto.RandomRestaurantResponse;
import com.ddingji.apirestaurant.controller.dto.RestaurantListResponse;
import com.ddingji.apirestaurant.domain.Restaurant;
import com.ddingji.apirestaurant.respository.RestaurantRepository;
import com.ddingji.apirestaurant.utils.RandomHolder;

import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {

	private final RestaurantRepository restaurantRepository;
	private final RandomHolder randomHolder;

	@Override
	public List<RestaurantListResponse> getRestaurantListByCategory(String name) {
		List<Restaurant> restaurantList = restaurantRepository.findRestaurantsByCategoryName(name);
		List<RestaurantListResponse> restaurantDtoList = new ArrayList<RestaurantListResponse>();
		for(Restaurant restaurant: restaurantList) {
			restaurantDtoList.add(RestaurantListResponse.create(restaurant));
		}
		return restaurantDtoList;

	}

	@Override
	public List<RestaurantListResponse> getRestaurantList() {
		List<Restaurant> restaurantList = restaurantRepository.findAllRestaurants();
		List<RestaurantListResponse> restaurantDtoList = new ArrayList<RestaurantListResponse>();
		for(Restaurant restaurant: restaurantList) {
			restaurantDtoList.add(RestaurantListResponse.create(restaurant));
		}
		return restaurantDtoList;
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
