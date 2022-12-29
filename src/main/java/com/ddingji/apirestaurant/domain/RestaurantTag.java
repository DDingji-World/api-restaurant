package com.ddingji.apirestaurant.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "restaurant_tag")
public class RestaurantTag {
    @Id
    @ManyToOne
    @JoinColumn(name = "res_id")
    private Restaurant restaurant;
    @Id
    @ManyToOne
    @JoinColumn(name = "tag_id")
    private Tag tag;
}
