package com.ddingji.apirestaurant.global.converter;

import com.ddingji.apirestaurant.domain.CategoryType;
import org.springframework.core.convert.converter.Converter;

public class CategoryTypeConverter implements Converter<String, CategoryType> {
    @Override
    public CategoryType convert(String source) {
        return CategoryType.ofType(source);
    }
}
