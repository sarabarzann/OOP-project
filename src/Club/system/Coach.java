
package Club.system;

import java.time.LocalDate;

public class Coach extends Staff {
	private String speciality;
	private double overTime;
	
	
	public Coach(int memberId, String name, String mobileNo, String nationality, String gender, double salary, String speciality, double overTime, LocalDate hireDate) {
		super(memberId, name, mobileNo, nationality, gender, salary, hireDate);
		this.setOverTime(overTime);
		this.setSpecialty(speciality);
	}

	
	public String getSpecialty() {
		return speciality;
	}
	
	public void setSpecialty(String specialty) {
		this.speciality = specialty;
	}
	
	public double getOverTime() {
		return overTime;
	}
	
	public void setOverTime(double overTime) {
		this.overTime = overTime;
	}
	
	
	@Override
	public String toString() {
		return String.format("\n%-10sMember type: Coach\nSpecialty: %-21sOvertime: %-10s", super.toString(), speciality, overTime);
	}

}
