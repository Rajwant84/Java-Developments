/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_6_10;

/**
 *
 * @author KHUSHWANT SINGH
 */
public class Student extends Person {
	private int status;
	public final static int FRESHMAN = 1;
	public final static int SOPHOMORE = 3;
	public final static int JUNIOR = 2;
	public final static int SENIOR = 4;

	public Student(String name, String address,  
		String phone, String email, int status) {
		super(name, address, phone, email);
		this.status = status;
	}

	/** Set new status */
	public void setStatus(int status) {
		this.status = status; 
	}

	/** Return status */
	public String getStatus() {
		switch (status) {
			case 1 : return "freshman"; 
			case 2 : return "sophomore"; 
			case 3 : return "junior"; 
			case 4 : return "senior";
			default : return "Unknown"; 
		}
	}

	/** Return a string discription of the class */
	public String toString() {
		return super.toString() + "\nStatus: " + getStatus();
	}
}
