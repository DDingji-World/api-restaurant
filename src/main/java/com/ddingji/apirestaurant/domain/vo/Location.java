package com.ddingji.apirestaurant.domain.vo;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor
public class Location {
    private String x;
    private String y;
}
