package com.ddingji.apirestaurant.domain;

public enum CategoryType {

	FLOURBASED("flourbased","분식"),
	JAPANESE("japanese","일식"),
	WESTERN_ASIAN("westernasian","양식/아시안"),
	MEAT("meat","고기"),
	KOREAN("korean","한식"),
	CHINESE("chinese","중식"),
	CAFE_DESSERT("cafedessert","카페/디저트"),
	CONVENIENCE("convenience","간편식");

	private String categoryNameEng;
	private String categoryNameKor;
	
	CategoryType(String categoryNameEng, String categoryNameKor){this.categoryNameEng = categoryNameEng; this.categoryNameKor = categoryNameKor;}
	
	public static CategoryType ofType(String source) {
		for(CategoryType type : CategoryType.values()) {
			if(type.categoryNameEng.equals(source)) {
				return type;
			}
		}
		return null;  //나중에 error 처리 해야함
	}
	
	
}
