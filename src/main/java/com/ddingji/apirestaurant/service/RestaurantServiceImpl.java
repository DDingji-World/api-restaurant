package com.ddingji.apirestaurant.service;

import com.ddingji.apirestaurant.controller.dto.RestaurantResponse;
import com.ddingji.apirestaurant.domain.CategoryType;
import com.ddingji.apirestaurant.domain.Restaurant;
import com.ddingji.apirestaurant.exception.RestaurantCategoryException;
import com.ddingji.apirestaurant.exception.RestaurantErrorCode;
import com.ddingji.apirestaurant.exception.RestaurantException;
import com.ddingji.apirestaurant.respository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {

	private final RestaurantRepository restaurantRepository;

	/**
	 * 레스토랑 리스트 리턴
	 * @param categoryType 카테고리 타입
	 * @return 레스토랑 리스트
	 */
	@Override
	public List<RestaurantResponse> getRestaurants(CategoryType categoryType) {
		return categoryType == null ?
				getRestaurantListAll() :
				getRestaurantListByCategory(categoryType);
	}

	/**
	 * 전체 레스토랑 리스트 리턴
	 * @return 레스토랑 리스트
	 */
	private List<RestaurantResponse> getRestaurantListAll() {
		List<Restaurant> restaurantList = restaurantRepository.findAllRestaurants();
		if(restaurantList.isEmpty()) throw new RestaurantException(RestaurantErrorCode.NOT_FOUND_RESTAURANT_DATA);

		Collections.shuffle(restaurantList);

		return restaurantList.stream()
				.map(RestaurantResponse::create)
				.toList();
	}

	/**
	 * 카테고리별 레스토랑 리스트 리턴
	 * @param categoryType 카테고리 타입
	 * @return 레스토랑 리스트
	 */
	private List<RestaurantResponse> getRestaurantListByCategory(CategoryType categoryType) {
		List<Restaurant> restaurantList = restaurantRepository.findRestaurantsByCategoryName(categoryType.getCategoryName());
		if(restaurantList.isEmpty()) throw new RestaurantCategoryException();

		Collections.shuffle(restaurantList);

		return restaurantList.stream()
				.map(RestaurantResponse::create)
				.toList();
	}

}
