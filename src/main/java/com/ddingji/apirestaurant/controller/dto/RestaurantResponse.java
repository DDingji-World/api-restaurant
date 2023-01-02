package com.ddingji.apirestaurant.controller.dto;

import com.ddingji.apirestaurant.domain.Restaurant;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;


public record RestaurantResponse(
        @JsonProperty("name") String name,
        @JsonProperty("x") String x,
        @JsonProperty("y") String y,
        @JsonProperty("url") String url,
        @JsonProperty("categories") List<CategoryResponse> categories,
        @JsonProperty("tags") List<TagResponse> tags) {

    public static RestaurantResponse create(Restaurant restaurant) {
        return new RestaurantResponse(restaurant.getName(), restaurant.getPlaceX(),
                restaurant.getPlaceY(), restaurant.getPlaceUrl(),
                restaurant.getCategoriesName().stream().map(CategoryResponse::new).toList(),
                restaurant.getTagsName().stream().map(TagResponse::new).toList());
    }
}
