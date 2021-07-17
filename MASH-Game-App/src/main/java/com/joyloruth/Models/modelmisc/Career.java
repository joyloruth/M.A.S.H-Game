package com.joyloruth.Models.modelmisc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "career", schema = "mashgame")
public class Career {
	
	private Long careerid;
	private String careerone;
	private String careertwo;
	private String careerthree;
	private String careerfour;
	
	Career(){
		
	}
	
	public Career(Long careerid, String careerone, String careertwo, String careerthree, String careerfour) {
		super();
		this.careerid = careerid;
		this.careerone = careerone;
		this.careertwo = careertwo;
		this.careerthree = careerthree;
		this.careerfour = careerfour;
	}


	/**
	 * @return the careerid
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getCareerid() {
		return careerid;
	}
	/**
	 * @param careerid the careerid to set
	 */
	public void setCareerid(Long careerid) {
		this.careerid = careerid;
	}
	/**
	 * @return the careerone
	 */
	public String getCareerone() {
		return careerone;
	}
	/**
	 * @param careerone the careerone to set
	 */
	public void setCareerone(String careerone) {
		this.careerone = careerone;
	}
	/**
	 * @return the careertwo
	 */
	public String getCareertwo() {
		return careertwo;
	}
	/**
	 * @param careertwo the careertwo to set
	 */
	public void setCareertwo(String careertwo) {
		this.careertwo = careertwo;
	}
	/**
	 * @return the careerthree
	 */
	public String getCareerthree() {
		return careerthree;
	}
	/**
	 * @param careerthree the careerthree to set
	 */
	public void setCareerthree(String careerthree) {
		this.careerthree = careerthree;
	}
	/**
	 * @return the careerfour
	 */
	public String getCareerfour() {
		return careerfour;
	}
	/**
	 * @param careerfour the careerfour to set
	 */
	public void setCareerfour(String careerfour) {
		this.careerfour = careerfour;
	}
	
	
	@Override
	public String toString() {
		return "Career [careerid=" + careerid + ", careerone=" + careerone + ", careertwo=" + careertwo
				+ ", careerthree=" + careerthree + ", careerfour=" + careerfour + "]";
	}
	
	
	

}
