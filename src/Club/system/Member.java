
package Club.system;

public abstract class Member {
	private int memberId;
	private String name;
	private String mobileNo;
	private String nationality;
	private String gender;
	
	
	public Member(int memberId, String name, String mobileNo, String nationality, String gender) {
		this.setMemberId(memberId);
		this.setName(name);
		this.setMobileNo(mobileNo);
		this.setNationality(nationality);
		this.setGender(gender);
	}
	
	public int getMemberId() {
		return memberId;
	}

	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getMobileNo() {
		return mobileNo;
	}

	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	
	public String getNationality() {
		return nationality;
	}

	
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	
	
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	public String toString() {
		return String.format("---------------------\nMember Id: %-10s\nName: %-9s\nMobile number: %-8s\nNationality: %-15s\nGender: %-7s\n", memberId, name, mobileNo, nationality, gender);
	}
	
	
	
	
	
	

}
