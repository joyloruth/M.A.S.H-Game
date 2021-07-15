package com.joyloruth.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "spouse", schema = "mashgame")
public class Spouse {
	
	private Long spouseid;
	private String spouseone;
	private String spousetwo;
	private String spousethree;
	private String spousefour;
	
	
	public Spouse(){
		
	}


	public Spouse(Long spouseid, String spouseone, String spousetwo, String spousethree, String spousefour) {
		super();
		this.spouseid = spouseid;
		this.spouseone = spouseone;
		this.spousetwo = spousetwo;
		this.spousethree = spousethree;
		this.spousefour = spousefour;
	}


	/**
	 * @return the spouseid
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getSpouseid() {
		return spouseid;
	}


	/**
	 * @param spouseid the spouseid to set
	 */
	public void setSpouseid(Long spouseid) {
		this.spouseid = spouseid;
	}


	/**
	 * @return the spouseone
	 */
	public String getSpouseone() {
		return spouseone;
	}


	/**
	 * @param spouseone the spouseone to set
	 */
	public void setSpouseone(String spouseone) {
		this.spouseone = spouseone;
	}


	/**
	 * @return the spousetwo
	 */
	public String getSpousetwo() {
		return spousetwo;
	}


	/**
	 * @param spousetwo the spousetwo to set
	 */
	public void setSpousetwo(String spousetwo) {
		this.spousetwo = spousetwo;
	}


	/**
	 * @return the spousethree
	 */
	public String getSpousethree() {
		return spousethree;
	}


	/**
	 * @param spousethree the spousethree to set
	 */
	public void setSpousethree(String spousethree) {
		this.spousethree = spousethree;
	}


	/**
	 * @return the spousefour
	 */
	public String getSpousefour() {
		return spousefour;
	}


	/**
	 * @param spousefour the spousefour to set
	 */
	public void setSpousefour(String spousefour) {
		this.spousefour = spousefour;
	}


	@Override
	public String toString() {
		return "Spouse [spouseid=" + spouseid + ", spouseone=" + spouseone + ", spousetwo=" + spousetwo
				+ ", spousethree=" + spousethree + ", spousefour=" + spousefour + "]";
	}

	
}
