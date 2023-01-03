package com.ddingji.apirestaurant.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.ConnectException;

import static com.ddingji.apirestaurant.exception.ErrorResponse.createErrorResponse;

@RestControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(RestaurantException.class)
    public ResponseEntity<ErrorResponse> handleRestaurantException(RestaurantException e, HttpServletRequest request) {
        return ResponseEntity.status(e.getHttpStatus())
                .body(createErrorResponse(e, request.getRequestURI()));
    }

    /** DB 커넥션 에러 핸들 */
    @org.springframework.web.bind.annotation.ExceptionHandler(ConnectException.class)
    public ResponseEntity<ErrorResponse> handleConnectException(HttpServletRequest request) {
        return ResponseEntity.status(RestaurantErrorCode.DB_CONNECT_FAIL.getHttpStatus())
                .body(createErrorResponse(RestaurantErrorCode.DB_CONNECT_FAIL, request.getRequestURI()));
    }
}
