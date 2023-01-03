package com.ddingji.apirestaurant.exception;

public class RestaurantCategoryException extends RestaurantException {
    public RestaurantCategoryException() {
        super("유효하지 않은 카테고리로 요청하셨습니다.");
    }
    public RestaurantCategoryException(String msg) {
        super(msg);
    }
}
