package com.ecommerce.webapp.Pojo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shoe_details")
public class ShoeDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="company")
	private String company;
	
	@Column(name="cataegory")
	private String category;
	
	@Column(name="size")
	private int size;
	
	@Column(name="prize")
	private double price;
	
   public ShoeDetails() {}
	
	public ShoeDetails(long id, String company, String category, int size, double price) {
		super();
		this.id = id;
		this.company = company;
		this.category = category;
		this.size = size;
		this.price = price;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	

}
