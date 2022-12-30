package com.ddingji.apirestaurant.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;

@Getter
@Setter
@Entity
@Table(name = "restaurant_tag")
public class RestaurantTag {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "res_id")
    private Restaurant restaurant;
    @Id
    @BatchSize(size = 20)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tag_id")
    private Tag tag;


    @Override
    public String toString() {
        return "RestaurantTag{" +
                "tag=" + tag +
                '}';
    }
}
