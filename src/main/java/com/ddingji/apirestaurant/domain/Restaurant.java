package com.ddingji.apirestaurant.domain;

import com.ddingji.apirestaurant.domain.vo.Place;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import org.hibernate.annotations.BatchSize;

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
    @OneToMany(mappedBy = "restaurant", fetch = FetchType.LAZY)
    private List<RestaurantCategory> categories ;
    @BatchSize(size = 20)
    @OneToMany(mappedBy = "restaurant", fetch = FetchType.LAZY)
    private List<RestaurantTag> tags;

    public String getPlaceX(){
        return place.getLocationX();
    }
    public String getPlaceY(){
        return place.getLocationY();
    }
    public String getPlaceUrl(){
        return place.getUrl();
    }

    public List<String> getCategoriesName(){
        return categories.stream()
                .map(rc -> rc.getCategory().getName())
                .toList();
    }

    public List<String> getTagsName(){
        return tags.stream()
                .map(t -> t.getTag().getName())
                .toList();
    }


    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", place=" + place +
                ", categories=" + categories +
                ", tags=" + tags +
                '}';
    }
}
