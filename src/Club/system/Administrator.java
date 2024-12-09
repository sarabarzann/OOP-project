

package Club.system;
import java.time.LocalDate;

public class Administrator extends Staff {
	private String jobTitle;
	
	public Administrator(int memberId, String name, String mobileNo, String nationality, String gender, String jobTitle, double salary, LocalDate hireDate) {
		super(memberId, name, mobileNo, nationality, gender, salary, hireDate);
		this.setJobTitle(jobTitle);
	}

	public String getJobTitle() {
		return jobTitle;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	
	
	@Override
	public String toString() {
		return String.format("\n%-10sMember type: Administrator\nAdministrator job title: %-8s", super.toString(),jobTitle);
	}
	
	

}