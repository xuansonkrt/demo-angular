package org.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="dbo_product")
public class Product {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    @Id
	private int id;
	
	@Column(name="name")
	private String name;
	
	
	@Column(name="price")
	private double price;
	
	@Column(name="category")
	private String category;
	
	@Column(name = "\"describe\"")
	private String describe;
	
	@Column(name="image")
	private String image;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Product(int id, String name, double price, String category, String describe, String image) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.describe = describe;
		this.image = image;
	}

	public Product() {
		
	}
	
	
}
