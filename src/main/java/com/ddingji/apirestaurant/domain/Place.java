package com.ddingji.apirestaurant.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Embeddable
@NoArgsConstructor
public class Place implements Serializable {
    private String url;
    @Embedded
    private Location location;

    public String getLocationX(){
        return location.getX();
    }
    public String getLocationY(){
        return location.getY();
    }
}
