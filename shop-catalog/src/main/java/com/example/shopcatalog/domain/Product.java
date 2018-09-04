package com.example.shopcatalog.domain; import org.springframework.data.annotation.Id; import java.net.InetAddress; import org.springframework.data.annotation.Transient; import java.net.UnknownHostException; public class 
Product {
	@Id
	private String id;
	private String title, category, description;
	private Integer availability;
	private Double price;
	@Transient
	public String hostname;
	public Product () {
		try {
            hostname = InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
          }
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getAvailability() {
		return availability;
	}
	public void setAvailability(Integer availability) {
		this.availability = availability;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
}
