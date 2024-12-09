
package Club.system;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;


public class Session {

	private int sessionId;
	private String name;
	private Coach coach;
	private LocalDate startDate;
	private LocalDate endDate;
	private LocalTime startTime;
	private LocalTime endTime;
	private double price;
	private ArrayList<Customer> customers = new ArrayList<Customer>();

	
	public Session(int sessionId, String name, Coach coach, LocalDate startDate, LocalDate endDate,
			LocalTime startTime, LocalTime endTime, double price, ArrayList<Customer> customers) {
		this.sessionId = sessionId;
		this.name = name;
		this.coach = coach;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.price = price;
		this.customers = customers;
	}

	
	public int getSessionId() {
		return sessionId;
	}

	
	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Coach getCoach() {
		return coach;
	}

	
	public void setCoach(Coach coach) {
		this.coach = coach;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	
	public LocalDate getEndDate() {
		return endDate;
	}

	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	
	public LocalTime getStartTime() {
		return startTime;
	}

	
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	
	public LocalTime getEndTime() {
		return endTime;
	}

	
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	
	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}

	
	public void registerCustomer(Customer customer) {
		if (customer.getClass().getSimpleName().equalsIgnoreCase("Customer")) {
			customers.add(customer);
		}
	}

	
	public void unregisterCustomer(int customerId) {
		for (Customer customer : customers) {
			if (customer.getMemberId() == customerId) {
				customers.remove(customer);
				break;
			}
		}
	}

	
        @Override
	public String toString() {
		return String.format("\n----SessionInfo----\n---------------------\nSessionId: %-7s\nName: %-10s\nCoach: %-8sStart date: %-15s End date: %-10s\nStart time: %-19s End time: %-10s"
				+ "\nPrice: %-7s\n\nCustomers: \n%s\n\n", sessionId, name, coach, startDate, endDate, startTime, endTime, price, customers);
	}


}


