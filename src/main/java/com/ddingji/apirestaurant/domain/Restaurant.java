package com.ddingji.apirestaurant.domain;

import com.ddingji.apirestaurant.domain.vo.Place;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "restaurant")
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "res_id")
    private Long id;
    private String name;
    @Embedded
    private Place place;

    private List<RestaurantCategory> categories;
    private List<RestaurantTag> tags;

}
