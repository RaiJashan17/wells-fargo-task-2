package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio{
	
	@Id //Note: Unable to use Relationship which is what I need to use
	private Client portfoliosClient;
	
	@Id 
	@GeneratedValue()
	private long portfolioId;
	
	@Column(nullable=false)
	private String creationDate;
	
	protected Portfolio() {

    }

	public Portfolio(Client client, String date) {
	this.portfoliosClient=client;
	this.creationDate=date;
	}	
	
	public Long getPortfolioId() {
		return portfolioId;
	}
	
	public Long getClientId() {
		return portfoliosClient.getClientId();
	}
	
	public String getCreationDate() {
		return creationDate;
	}
	
	public void setCreationDate(String date) {
		this.creationDate=date;
	}
}