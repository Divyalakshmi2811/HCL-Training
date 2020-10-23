package org.hcl;

public class Address {
	private int hno;
	private String streetName;
	private String loc;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(int hno, String streetName, String loc) {
		super();
		this.hno = hno;
		this.streetName = streetName;
		this.loc = loc;
	}
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
