package jas.kum.shopingbackend.dao;

import java.util.List;

import jas.kum.shopingbackend.dto.Category;

public interface CategoryDAO {
	
	
	List<Category> list();

	Category get(int id);

}
