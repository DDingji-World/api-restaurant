package com.ddingji.apirestaurant.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "restaurant_tag")
public class RestaurantTag implements Serializable {
    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "res_id")
    private Restaurant restaurant;
    @Id
    @BatchSize(size = 20)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tag_id")
    private Tag tag;


    @Override
    public String toString() {
        return "RestaurantTag{" +
                "tag=" + tag +
                '}';
    }
}
