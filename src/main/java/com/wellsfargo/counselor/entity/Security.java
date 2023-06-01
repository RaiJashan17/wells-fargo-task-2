package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity 
public class Security{
	
	@Id //Note: Unable to use Relationship which is what I need to use
	private Portfolio securityPortfolio;
	
	@Id
	@GeneratedValue()
	private long securityId;
	
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false)
	private String category;
	
	@Column(nullable=false)
	private String purchasePrice;
	
	@Column(nullable=false)
	private String purchaseDate;
	
	@Column(nullable=false)
	private int quantity;
	
	protected Security() {

    }
	
	public Security(Portfolio portfolio, String name, String category, 
			String purchasePrice, String purchaseDate, int quantity) {
		this.securityPortfolio=portfolio;
		this.name=name;
		this.category=category;
		this.purchasePrice=purchasePrice;
		this.purchaseDate=purchaseDate;
		this.quantity=quantity;
	}
	
	public Long getPortfolioId() {
		return securityPortfolio.getPortfolioId();
	}
	
	public Long getSecurityId() {
		return securityId;
	}
	
	public String getName() {
		return name;
	}
	
	public String category() {
		return category;
	}
	
	public String purchasePrice() {
		return purchasePrice;
	}
	
	public String purchaseDate() {
		return purchaseDate;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setCategory(String category) {
		this.category=category;
	}
	
	public void setPurchasePrice(String purchasePrice) {
		this.purchasePrice=purchasePrice;
	}
	
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate=purchaseDate;
	}
	
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
}