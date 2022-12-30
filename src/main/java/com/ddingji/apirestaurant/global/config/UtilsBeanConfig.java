package com.ddingji.apirestaurant.global.config;

import com.ddingji.apirestaurant.utils.RandomHolder;
import com.ddingji.apirestaurant.utils.RandomHolderImpl;
import javax.management.MXBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UtilsBeanConfig {

    @Bean
    public RandomHolder randomHolder(){
        return new RandomHolderImpl();
    }

}
