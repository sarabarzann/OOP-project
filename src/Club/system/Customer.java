
package Club.system;


public class Customer extends Member {
	private Type memberShipType;
	private double discount;
	
	public Customer(int memberId, String name, String mobileNo, String nationality, String gender,Type memberShipType,double discount) {
		super(memberId, name, mobileNo, nationality, gender);
		this.discount=discount;
		this.memberShipType=memberShipType;
	}
		
		public Type getMembershipType() {
			return memberShipType;
		}

		
		public void setMembershipType(Type membershipType) {
			this.memberShipType = membershipType;
		}

		
		public double getDiscount() {
			return discount;
		}

		
		public void setDiscount(double discount) {
			this.discount = discount;
		}

		
	@Override
	public String toString() {
		return String.format("\n%-10sMember type: Customer\nDiscount amount: %-7sMembership type: %-7s", super.toString(), discount, memberShipType);
	}
	

}

