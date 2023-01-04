package com.ddingji.apirestaurant.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "restaurant_category")
public class RestaurantCategory implements Serializable {
    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "res_id")
    private Restaurant restaurant;
    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private Category category;

    @Override
    public String toString() {
        return "RestaurantCategory{" +
                "category=" + category +
                '}';
    }
}
