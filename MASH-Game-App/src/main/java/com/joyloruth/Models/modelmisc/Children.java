package com.joyloruth.Models.modelmisc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "children", schema = "mashgame")
public class Children {
	
	private Long childrenid;
	private String childrenone;
	private String childrentwo;
	private String childrenthree;
	private String childrenfour;
	
	public Children(){
		
	}

	public Children(Long childrenid, String childrenone, String childrentwo, String childrenthree, String childrenfour) {
		super();
		this.childrenid = childrenid;
		this.childrenone = childrenone;
		this.childrentwo = childrentwo;
		this.childrenthree = childrenthree;
		this.childrenfour = childrenfour;
	}

	/**
	 * @return the childrenid
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getChildrenid() {
		return childrenid;
	}

	/**
	 * @param childrenid the childrenid to set
	 */
	public void setChildrenid(Long childrenid) {
		this.childrenid = childrenid;
	}

	/**
	 * @return the childrenone
	 */
	public String getChildrenone() {
		return childrenone;
	}

	/**
	 * @param childrenone the childrenone to set
	 */
	public void setChildrenone(String childrenone) {
		this.childrenone = childrenone;
	}

	/**
	 * @return the childrentwo
	 */
	public String getChildrentwo() {
		return childrentwo;
	}

	/**
	 * @param childrentwo the childrentwo to set
	 */
	public void setChildrentwo(String childrentwo) {
		this.childrentwo = childrentwo;
	}

	/**
	 * @return the childrenthree
	 */
	public String getChildrenthree() {
		return childrenthree;
	}

	/**
	 * @param childrenthree the childrenthree to set
	 */
	public void setChildrenthree(String childrenthree) {
		this.childrenthree = childrenthree;
	}

	/**
	 * @return the childrenfour
	 */
	public String getChildrenfour() {
		return childrenfour;
	}

	/**
	 * @param childrenfour the childrenfour to set
	 */
	public void setChildrenfour(String childrenfour) {
		this.childrenfour = childrenfour;
	}

	@Override
	public String toString() {
		return "Children [childrenid=" + childrenid + ", childrenone=" + childrenone + ", childrentwo=" + childrentwo + ", childrenthree=" + childrenthree
				+ ", childrenfour=" + childrenfour + "]";
	}
	
}
	
	