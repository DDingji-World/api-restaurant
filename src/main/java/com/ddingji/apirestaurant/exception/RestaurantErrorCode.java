package com.ddingji.apirestaurant.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum RestaurantErrorCode implements ErrorCode {
    IO_EXCEPTION(HttpStatus.SERVICE_UNAVAILABLE, "현재 시스템에 오류가 발생하였습니다. 빠르게 조치하겠습니다."),
    DB_CONNECT_FAIL(HttpStatus.SERVICE_UNAVAILABLE, "현재 시스템에 오류가 발생하였습니다. 빠르게 조치하겠습니다."),
    INVALID_REQUEST_CATEGORY(HttpStatus.BAD_REQUEST, "유효하지 않은 카테고리로 요청하셨습니다."),
    NOT_FOUND_RESTAURANT_DATA(HttpStatus.SERVICE_UNAVAILABLE, "음식점 데이터가 존재하지 않습니다.")
    ;

    private final HttpStatus httpStatus;
    private final String errorMessage;

    @Override
    public String getErrorName() {
        return name();
    }
}
