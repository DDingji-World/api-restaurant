package com.ddingji.apirestaurant.domain;

import com.ddingji.apirestaurant.exception.RestaurantCategoryException;

public enum CategoryType {

	FLOUR_BASED("분식"),
	JAPANESE("일식"),
	WESTERN_ASIAN("양식/아시안"),
	MEAT("고기"),
	KOREAN("한식"),
	CHINESE("중식"),
	CAFE_DESSERT("카페/디저트"),
	CONVENIENCE("간편식");

	private String categoryName;
	
	CategoryType(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public static CategoryType ofType(String source) {
		for(CategoryType type : CategoryType.values()) {
			if(type.categoryName.equals(source)) {
				return type;
			}
		}
		throw new RestaurantCategoryException();
	}
	
	
}
