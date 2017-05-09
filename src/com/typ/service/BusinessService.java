package com.typ.service;

import java.util.List;

import com.typ.domain.Category;

public interface BusinessService {
	/**
	 * 添加一个分类
	 * @param category
	 */
	void addCategory(Category category);
	/**
	 * 查询所有分类
	 * @return
	 */
	List<Category> findAllCategories();
	/**
	 * 根据主键查询一个分类
	 * @param categoryId
	 * @return 没有找到返回null
	 */
	Category findCategoryById(String categoryId);
}
