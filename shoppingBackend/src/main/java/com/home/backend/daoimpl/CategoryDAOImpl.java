package com.home.backend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.home.backend.dao.CategoryDAO;
import com.home.backend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<Category>();

	static {
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("TV");
		category.setImageURL("./images/image1");
		categories.add(category);

		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("mobiles");
		category.setImageURL("./images/image2");
		categories.add(category);

		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("Laptop");
		category.setImageURL("./images/image3");
		categories.add(category);
	}

	public List<Category> listCategory() {
		// TODO Auto-generated method stub
		return categories;
	}

	public Category getCategory(int id) {
		for (Category category : categories) {
			if (category.getId() == id) {
				return category;
			}
		}
		return null;
	}

}
