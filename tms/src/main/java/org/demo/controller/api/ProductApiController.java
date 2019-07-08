package org.demo.controller.api;

import java.util.List;
import java.util.Optional;

import org.demo.Services.ProductService;
import org.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class ProductApiController {

	@Autowired
	ProductService productService;
	
	@GetMapping("/getAll")
	public List<Product> getAll(){
		return productService.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Product> getById(@PathVariable Integer id){
		return productService.findOne(id);
	}
	
	@DeleteMapping("/{id}")
	public boolean delete(@PathVariable Integer id) {
		return productService.delete(id);
	}
	
	@PostMapping("")
	public Product create(@RequestBody Product product){
		return productService.save(product);
	}
	
	@PutMapping("")
	public Product update(@RequestBody Product product){
		return productService.save(product);
	}
}
