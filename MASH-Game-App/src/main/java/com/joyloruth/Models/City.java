package com.joyloruth.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "city", schema = "mashgame")
public class City {
	
	private Long cityid;
	private String cityone;
	private String citytwo;
	private String citythree;
	private String cityfour;
	
	public City(){
		
	}

	public City(Long cityid, String cityone, String citytwo, String citythree, String cityfour) {
		super();
		this.cityid = cityid;
		this.cityone = cityone;
		this.citytwo = citytwo;
		this.citythree = citythree;
		this.cityfour = cityfour;
	}

	/**
	 * @return the cityid
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getCityid() {
		return cityid;
	}

	/**
	 * @param cityid the cityid to set
	 */
	public void setCityid(Long cityid) {
		this.cityid = cityid;
	}

	/**
	 * @return the cityone
	 */
	public String getCityone() {
		return cityone;
	}

	/**
	 * @param cityone the cityone to set
	 */
	public void setCityone(String cityone) {
		this.cityone = cityone;
	}

	/**
	 * @return the citytwo
	 */
	public String getCitytwo() {
		return citytwo;
	}

	/**
	 * @param citytwo the citytwo to set
	 */
	public void setCitytwo(String citytwo) {
		this.citytwo = citytwo;
	}

	/**
	 * @return the citythree
	 */
	public String getCitythree() {
		return citythree;
	}

	/**
	 * @param citythree the citythree to set
	 */
	public void setCitythree(String citythree) {
		this.citythree = citythree;
	}

	/**
	 * @return the cityfour
	 */
	public String getCityfour() {
		return cityfour;
	}

	/**
	 * @param cityfour the cityfour to set
	 */
	public void setCityfour(String cityfour) {
		this.cityfour = cityfour;
	}

	@Override
	public String toString() {
		return "City [cityid=" + cityid + ", cityone=" + cityone + ", citytwo=" + citytwo + ", citythree=" + citythree
				+ ", cityfour=" + cityfour + "]";
	}
	
	


	


	
	

}
