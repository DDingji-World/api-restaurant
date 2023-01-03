package com.ddingji.apirestaurant.exception;

public class RestaurantCategoryException extends RestaurantException {
    public RestaurantCategoryException() {
        super(RestaurantErrorCode.INVALID_REQUEST_CATEGORY);
    }
}
