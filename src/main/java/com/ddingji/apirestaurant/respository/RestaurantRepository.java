package com.ddingji.apirestaurant.respository;

import com.ddingji.apirestaurant.domain.Restaurant;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    @Query("select distinct r from Restaurant r "
            + "left join fetch r.categories rc  "
            + "left join fetch rc.category c  "
            + "where c.name = :name")
    List<Restaurant> findRestaurantsByCategoryName(@Param("name") String name);

    @Query("select distinct r from Restaurant r "
            + "left join fetch r.categories rc  "
            + "left join fetch rc.category c")
    List<Restaurant> findAllRestaurants();
}
