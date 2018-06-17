package com.home.backend.dao;

import java.util.List;

import com.home.backend.dto.Category;

public interface CategoryDAO {
	List<Category> listCategory();

	Category getCategory(int id);
}
