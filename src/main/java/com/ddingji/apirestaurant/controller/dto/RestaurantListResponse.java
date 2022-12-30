package com.ddingji.apirestaurant.controller.dto;

import java.util.List;

import com.ddingji.apirestaurant.domain.Restaurant;
import com.fasterxml.jackson.annotation.JsonProperty;

public record RestaurantListResponse (@JsonProperty("name") String name,
        @JsonProperty("x") String x,
        @JsonProperty("y") String y,
        @JsonProperty("url") String url,
        @JsonProperty("categories") List<String> categories,
        @JsonProperty("tags") List<String> tags){
	


	public static RestaurantListResponse create(Restaurant restaurant) {
        return new RestaurantListResponse(restaurant.getName(), restaurant.getPlaceX(),
                restaurant.getPlaceY(), restaurant.getPlaceUrl(),
                restaurant.getCategoriesName(),
                restaurant.getTagsName());
    }
}
