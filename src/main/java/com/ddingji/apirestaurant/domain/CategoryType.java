package com.ddingji.apirestaurant.domain;

import com.ddingji.apirestaurant.exception.RestaurantCategoryException;

public enum CategoryType {

	FLOUR_BASED("flourbased","분식"),
	JAPANESE("japanese","일식"),
	WESTERN_ASIAN("westernasian","양식/아시안"),
	MEAT("meat","고기"),
	KOREAN("korean","한식"),
	CHINESE("chinese","중식"),
	CAFE_DESSERT("cafedessert","카페/디저트"),
	CONVENIENCE("convenience","간편식");

	private String categoryNameEng;
	private String categoryNameKor;
	
	CategoryType(String categoryNameEng, String categoryNameKor) {
		this.categoryNameEng = categoryNameEng;
		this.categoryNameKor = categoryNameKor;
	}

	public String getCategoryNameKor() {
		return categoryNameKor;
	}

	public static CategoryType ofType(String source) {
		for(CategoryType type : CategoryType.values()) {
			if(type.categoryNameEng.equals(source)) {
				return type;
			}
		}
		throw new RestaurantCategoryException();
	}
	
	
}
