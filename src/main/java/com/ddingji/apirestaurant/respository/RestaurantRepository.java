package com.ddingji.apirestaurant.respository;

import com.ddingji.apirestaurant.domain.Restaurant;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    @Query("select distinct r from Restaurant r "
            + "left join fetch r.categories rc  "
            + "left join fetch rc.category c  "
            + "where c.name = :name")
    @Cacheable(value = "restaurant", key = "#name")
    List<Restaurant> findRestaurantsByCategoryName(@Param("name") String name);

    @Query("select distinct r from Restaurant r "
            + "left join fetch r.categories rc  "
            + "left join fetch rc.category c")
    @Cacheable(value = "restaurant")
    List<Restaurant> findAllRestaurants();

    @Override
    @Cacheable(value = "restaurant", key = "#id")
    Optional<Restaurant> findById(Long id);
}
