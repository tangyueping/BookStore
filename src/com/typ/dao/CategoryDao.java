package com.typ.dao;

import java.util.List;

import com.typ.domain.Category;

public interface CategoryDao {

	void save(Category category);

	List<Category> findAll();

	Category findById(String categoryId);

}
