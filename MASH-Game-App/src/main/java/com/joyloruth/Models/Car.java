package com.joyloruth.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car", schema = "mashgame")
public class Car {
	
	private Long carid;
	private String carone;
	private String cartwo;
	private String carthree;
	private String carfour;
	
	public Car(){
		
	}
	
	public Car(Long carid, String carone, String cartwo, String carthree, String carfour) {
		super();
		this.carid = carid;
		this.carone = carone;
		this.cartwo = cartwo;
		this.carthree = carthree;
		this.carfour = carfour;
	}
	
	/**
	 * @return the carid
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getCarid() {
		return carid;
	}
	/**
	 * @param carid the carid to set
	 */
	public void setCarid(Long carid) {
		this.carid = carid;
	}
	/**
	 * @return the carone
	 */
	public String getCarone() {
		return carone;
	}
	/**
	 * @param carone the carone to set
	 */
	public void setCarone(String carone) {
		this.carone = carone;
	}
	/**
	 * @return the cartwo
	 */
	public String getCartwo() {
		return cartwo;
	}
	/**
	 * @param cartwo the cartwo to set
	 */
	public void setCartwo(String cartwo) {
		this.cartwo = cartwo;
	}
	/**
	 * @return the carthree
	 */
	public String getCarthree() {
		return carthree;
	}
	/**
	 * @param carthree the carthree to set
	 */
	public void setCarthree(String carthree) {
		this.carthree = carthree;
	}
	/**
	 * @return the carfour
	 */
	public String getCarfour() {
		return carfour;
	}
	/**
	 * @param carfour the carfour to set
	 */
	public void setCarfour(String carfour) {
		this.carfour = carfour;
	}

	@Override
	public String toString() {
		return "Car [carid=" + carid + ", carone=" + carone + ", cartwo=" + cartwo + ", carthree=" + carthree
				+ ", carfour=" + carfour + "]";
	}
	
	
}
