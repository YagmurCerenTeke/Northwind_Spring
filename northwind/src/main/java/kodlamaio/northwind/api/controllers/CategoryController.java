package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.CategoryService;
import kodlamaio.northwind.entities.concretes.Category;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin
public class CategoryController {

	private CategoryService categoryService;

	@Autowired
	public CategoryController(CategoryService categoryService) {
		super();
		this.categoryService = categoryService;
	}
	
	@GetMapping("/getAll")
	public List<Category> getAll(){
		return this.categoryService.getAll();
	}
	
}
