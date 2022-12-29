package com.ddingji.apirestaurant.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "restaurant_category")
public class RestaurantCategory {
    @Id
    @ManyToOne
    @JoinColumn(name = "res_id")
    private Restaurant restaurant;
    @Id
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
