
package Club.system;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Runner {
	ArrayList<Member> members = new ArrayList<Member>();
	ArrayList<Session> sessions = new ArrayList<Session>();
	ArrayList<Customer> customers = new ArrayList<Customer>();
	ArrayList<Member> members2 = new ArrayList<Member>();
	ArrayList<Session> sessions2 = new ArrayList<Session>();
	ArrayList<Customer> customers2 = new ArrayList<Customer>();
	
	LocalDate startDate = LocalDate.of(2022, 10, 1);
	LocalDate endDate = LocalDate.of(2022, 10, 31);
	
	LocalTime startTime = LocalTime.of(10, 0);
	LocalTime endTime = LocalTime.of(12, 0);

	LocalDate startDate2 = LocalDate.of(2008, 5, 20);
	LocalDate endDate2 = LocalDate.of(2008, 5, 30);

	LocalTime startTime2 = LocalTime.of(14, 0);
	LocalTime endTime2 = LocalTime.of(15, 0);
	
	public Runner() {
		Customer c1 = new Customer(123456, "Mahmoud", "9988711", "iran", "Male", Type.Monthly, 0.25);
		Customer c2 = new Customer(654321, "Fatma", "2628987", "Turkey", "Female", Type.Daily, 0.30);
		customers.add(c1);
		customers.add(c2);

		Customer c3 = new Customer(121423, "Ali", "1749147", "Syria", "Male", Type.Monthly, 0.25);
		Customer c4 = new Customer(57321, "Sara", "88199111", "Kurdistan", "Female", Type.Daily, 0.30);
		customers2.add(c3);
		customers2.add(c4);

		Administrator admin1 = new Administrator(667788, "Nasser", "99887766", "Iraq",
				"Male", "Manager", 12000.00, LocalDate.of(2021, 9, 1));
		Administrator admin2 = new Administrator(557788, "jamal", "8909426", "Egypt",
				"Male", "Human Resources Manager", 13000.00, LocalDate.of(2020, 8, 23));
		members.add(admin1);
		members.add(admin2);

		members.add(c1);
		members.add(c2);

		Coach coach1 = new Coach(554433, "Salar", "7788663", "Syria", "Male", 20000.00,
				"Basketball", 600.0, LocalDate.of(2019, 6, 12));
		Coach coach2 = new Coach(298234, "Layla", "1236772", "iraq", "Female", 30000.00,
				"Powerlifting", 800.0, LocalDate.of(2022, 8, 8));
		members.add(coach1);
		members.add(coach2);

		Administrator admin3 = new Administrator(1092391, "danyar", "99001921", "Palestine",
				"Male", "Manager", 12000.00, LocalDate.of(2021, 9, 1));
		Administrator admin4 = new Administrator(5340593, "Mina", "99174414", "Egypt",
				"Female", "Secretary", 11000.00, LocalDate.of(2018, 1, 23));
		members2.add(admin3);
		members2.add(admin4);

		Coach coach3 = new Coach(66443232, "Anas", "7788663", "UAE", "Male",
				20000.00, "Volleyball", 600.0, LocalDate.of(2019, 6, 12));
		Coach coach4 = new Coach(29383293, "Esraa", "1236772", "Turkey", "Female",
				32000.00, "HandBall", 850.0, LocalDate.of(2020, 8, 9));
		members2.add(coach3);
		members2.add(coach4);

		members2.add(c3);
		members2.add(c4);

		Session s1 = new Session(112112, "Football session", coach1, startDate, endDate, startTime, endTime, 1000.00, customers);
		Session s2 = new Session(157612, "Volleyball session", coach3, startDate2, endDate2, startTime2, endTime2,750.00, customers2);
		Session s3 = new Session(423423, "Powerlifting training", coach2, startDate, endDate, startTime, endTime, 500.00, customers);
		Session s4 = new Session(222122, "Handball session", coach4, startDate2, endDate2, startTime2, endTime2, 650.00, customers2);
		sessions.add(s1);
		sessions.add(s2);
		sessions2.add(s3);
		sessions2.add(s4);

		Club club = new Club("Kurdistan Club", "Slemani", "www.Kurdistanclub.com","44995589", members, sessions);
		Club club2 = new Club("Kirkuk Club", "Kirkuk", "www.Kirkuk.com","44778854", members2, sessions2);
		System.out.println(club);
		System.out.println(club2);

		System.out.println("\n---------------------\nNumber of members in Kurdistan Club |Club1|: " + club.getMembers().size());
		System.out.println("\n---------------------\nNumber of members in Kirkuk Club |Club2|: " + club2.getMembers().size());

		System.out.println("\n---------------------\nCustomer 1 Fees: " + calculateFees(sessions, c1));
		System.out.println("\n---------------------\nCustomer 2 Fees: " + calculateFees(sessions, c2));
		System.out.println("\n---------------------\nCustomer 3 Fees: " + calculateFees(sessions2, c3));
		System.out.println("\n---------------------\nCustomer 4 Fees: " + calculateFees(sessions2, c4));

	}

	
	public double calculateFees(ArrayList<Session> sessions, Customer c) {
		double grandTotal = 0;
		double discountPerc = c.getDiscount();
		double totalFees = 0;
		for (Session session : sessions) {
			ArrayList<Customer> customers = session.getCustomers();
			for (Customer customer : customers) {
				if (customer.getMemberId() == c.getMemberId()) {
					totalFees += session.getPrice();
					break;
				}
			}
		}
		grandTotal = totalFees - (totalFees * discountPerc);
		return grandTotal;
	}

	public static void main(String[] args) {
		new Runner();

	}

}
