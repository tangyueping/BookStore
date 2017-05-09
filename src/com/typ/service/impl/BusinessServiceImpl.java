package com.typ.service.impl;

import com.typ.dao.CategoryDao;
import com.typ.dao.impl.CategoryDaoImpl;
import com.typ.domain.Category;
import com.typ.service.BusinessService;

import java.util.List;
import java.util.UUID;

public class BusinessServiceImpl implements BusinessService {

    private CategoryDao categoryDao = new CategoryDaoImpl();

    public void addCategory(Category category) {
        category.setId(UUID.randomUUID().toString());
        categoryDao.save(category);

    }

    public List<Category> findAllCategories() {
        return categoryDao.findAll();

    }

    public Category findCategoryById(String categoryId) { return categoryDao.findById(categoryId); } }