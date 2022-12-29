package com.ddingji.apirestaurant.respository;

import com.ddingji.apirestaurant.domain.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}
