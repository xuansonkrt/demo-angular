package org.demo.Services;

import java.util.List;
import java.util.Optional;

import org.demo.model.Product;
import org.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAll(){
		return productRepository.findAll();
	}
	
	public Optional<Product> findOne(int id) {
		return productRepository.findById(id);
	}
	
	public boolean delete(Integer id) {
		try {
            productRepository.deleteById(id);
            return true;
        } catch (Exception e) {
           
        }
        return false;
	}
	
	public Product save(Product product) {
		return productRepository.save(product);
	}
}
