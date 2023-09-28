package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="NEW_TRAVELL")
public class TravellingModel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String source;
    
    @Column
    private String destination;
    
    @Column
    private String car;
    public TravellingModel() {}
    public TravellingModel(Long id, String source, String destination, String car, String price, String distance) {
		super();
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.car = car;
		this.price = price;
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Travelling [id=" + id + ", source=" + source + ", destination=" + destination + ", car=" + car
				+ ", price=" + price + ", distance=" + distance + "]";
	}

	@Column
    private String price;
    
    public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	@Column
    private String distance;
    
}
