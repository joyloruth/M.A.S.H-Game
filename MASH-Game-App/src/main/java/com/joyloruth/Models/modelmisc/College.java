package com.joyloruth.Models.modelmisc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "college", schema = "mashgame")
public class College {
	
	private Long collegeid;
	private String collegeone;
	private String collegetwo;
	private String collegethree;
	private String collegefour;
	
	
	public College(){
		
	}
	
	public College(Long collegeid, String collegeone, String collegetwo, String collegethree, String collegefour) {
		super();
		this.collegeid = collegeid;
		this.collegeone = collegeone;
		this.collegetwo = collegetwo;
		this.collegethree = collegethree;
		this.collegefour = collegefour;
	}



	/**
	 * @return the collegeid
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getCollegeid() {
		return collegeid;
	}
	/**
	 * @param collegeid the collegeid to set
	 */
	public void setCollegeid(Long collegeid) {
		this.collegeid = collegeid;
	}
	/**
	 * @return the collegeone
	 */
	public String getCollegeone() {
		return collegeone;
	}
	/**
	 * @param collegeone the collegeone to set
	 */
	public void setCollegeone(String collegeone) {
		this.collegeone = collegeone;
	}
	/**
	 * @return the collegetwo
	 */
	public String getCollegetwo() {
		return collegetwo;
	}
	/**
	 * @param collegetwo the collegetwo to set
	 */
	public void setCollegetwo(String collegetwo) {
		this.collegetwo = collegetwo;
	}
	/**
	 * @return the collegethree
	 */
	public String getCollegethree() {
		return collegethree;
	}
	/**
	 * @param collegethree the collegethree to set
	 */
	public void setCollegethree(String collegethree) {
		this.collegethree = collegethree;
	}
	/**
	 * @return the collegefour
	 */
	public String getCollegefour() {
		return collegefour;
	}
	/**
	 * @param collegefour the collegefour to set
	 */
	public void setCollegefour(String collegefour) {
		this.collegefour = collegefour;
	}

	@Override
	public String toString() {
		return "College [collegeid=" + collegeid + ", collegeone=" + collegeone + ", collegetwo=" + collegetwo
				+ ", collegethree=" + collegethree + ", collegefour=" + collegefour + "]";
	}
	
	
	

}
