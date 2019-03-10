package com.xworkz.Recipe;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;



@Entity
@Table(name="Recipe")
public class RecipeDTO implements Serializable {

	
	@GenericGenerator(name="rec" ,strategy="increment")
	@GeneratedValue(generator="rec")
	@Column(name="id")
	@Id
	private int rid;
	@Column(name="name")
	private String name;
	@Column(name="price")
	private double price;
	@Column(name="type")
	private String type;
	
	public RecipeDTO() {
		
		System.out.println("created:\t"+this.getClass().getSimpleName());
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
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

	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "RecipeDTO [rid=" + rid + ", name=" + name + ", price=" + price + ", type=" + type + "]";
	}
	
	
	
	
}
