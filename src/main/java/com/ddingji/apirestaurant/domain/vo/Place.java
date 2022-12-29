package com.ddingji.apirestaurant.domain.vo;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor
public class Place {
    private String url;
    @Embedded
    private Location location;
}
