package com.programmingfree.springservice.data.entities;

import org.springframework.data.rest.core.config.Projection;

import java.util.Collection;

@Projection(name = "withSubcategories", types = Category.class)
public interface CategoryWithSubcategoriesProjection {
    int getId();
    String getName();
    Collection<Subcategory> getSubcategories();
}