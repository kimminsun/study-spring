package org.zerock.domain;

public class productVO {
	private String name;
	private double price;
	
	public productVO(String name,double price){
		super();
		this.name=name;
		this.price=price;
	}
	
	public String getName(){
		return name;
	}
	public double getPrice(){
		return price;
	}

}
