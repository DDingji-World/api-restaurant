package com.ddingji.apirestaurant.controller.dto;

import com.ddingji.apirestaurant.domain.Restaurant;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record RestaurantInfoResponse(
        @JsonProperty("name") String name,
        @JsonProperty("url") String url,
        @JsonProperty("categories") List<CategoryResponse> categories,
        @JsonProperty("tags") List<TagResponse> tags
) {
    public static RestaurantInfoResponse create(Restaurant restaurant) {
        return new RestaurantInfoResponse(
                restaurant.getName(),
                restaurant.getPlaceUrl(),
                restaurant.getCategoriesName().stream().map(CategoryResponse::new).toList(),
                restaurant.getTagsName().stream().map(TagResponse::new).toList()
        );
    }
}
