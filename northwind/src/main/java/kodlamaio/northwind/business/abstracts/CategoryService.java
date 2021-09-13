package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.entities.concretes.Category;

public interface CategoryService {

	List<Category> getAll();
	
}
