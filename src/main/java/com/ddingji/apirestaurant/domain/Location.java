package com.ddingji.apirestaurant.domain;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Embeddable
@NoArgsConstructor
public class Location implements Serializable {
    private String x;
    private String y;
}
