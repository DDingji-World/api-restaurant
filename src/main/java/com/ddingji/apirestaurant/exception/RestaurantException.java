package com.ddingji.apirestaurant.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class RestaurantException extends RuntimeException implements ErrorCode {
    private final HttpStatus httpStatus;
    private final String errorName;
    private final String errorMessage;
    public RestaurantException(ErrorCode errorCode) {
        this.httpStatus = errorCode.getHttpStatus();
        this.errorName = errorCode.getErrorName();
        this.errorMessage = errorCode.getErrorMessage();
    }
}
