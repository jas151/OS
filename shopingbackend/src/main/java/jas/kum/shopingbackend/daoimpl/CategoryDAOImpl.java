package jas.kum.shopingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import jas.kum.shopingbackend.dao.CategoryDAO;
import jas.kum.shopingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static 	List<Category> categories=new ArrayList<>();
	
	//static block to define a list of categories
	static{
		      //adding first category
		      Category category=new Category();
		      category.setId(1);
		      category.setName("Television");
		      category.setDescripton("this is description for television");
		      category.setImageURL("CAT_1.png");
		      categories.add(category);
		
		        //adding second category
				Category category2=new Category();
				category2.setId(2);
				category2.setName("Mobile");
				category2.setDescripton("this is description for television");
				category2.setImageURL("CAT_1.png");
				categories.add(category2);
				
				//adding third category
				Category category3=new Category();
				category3.setId(3);
				category3.setName("Laptop");
				category3.setDescripton("this is description for television");
				category3.setImageURL("CAT_1.png");
				categories.add(category3);
	}
	@Override
	public List<Category> list() {
		
		return categories;
	}
	@Override
	public Category get(int id) {
		
		for(Category category:categories){
			if(category.getId()==id){
				return category;
			}
		}
		
		return null;
	}

}
