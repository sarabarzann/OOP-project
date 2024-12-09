
package Club.system;

import java.util.ArrayList;



public class Club {
	private String name;
	private String city;
	private String website;
	private String phone; 
	private ArrayList<Member> members = new ArrayList<Member>();
	private ArrayList<Session> sessions  = new ArrayList<Session>();
	
	public Club(String name, String city, String website, String phone, ArrayList<Member> members,
			ArrayList<Session> sessions) {
		this.name = name;
		this.city = city;
		this.website = website;
		this.phone = phone;
		this.members = members;
		this.sessions = sessions;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getWebsite() {
		return website;
	}
	
	public void setWebsite(String website) {
		this.website = website;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public ArrayList<Member> getMembers() {
		return members;
	}
	
	public void setMembers(ArrayList<Member> members) {
		this.members = members;
	}
	
	public ArrayList<Session> getSessions() {
		return sessions;
	}
	
	public void setSessions(ArrayList<Session> sessions) {
		this.sessions = sessions;
	}
	
	public void addMember(Member member) {
		members.add(member);
	}
	
	public void removeMember(int memberID) {
		for (Member obj : members) {
			if(obj.getMemberId()==memberID) {
				members.remove(obj);
				break;
			}
		}
	}
	
	public Member findMember(int memberId) {
		for (Member obj : members) {
			if (obj.getMemberId()==memberId) {
				return obj;
			}
			
		}
		return null;
	}
	
	public void addSession(Session session) {
		sessions.add(session);
	}
	
	public void removeSession(int sessionId) {
		for (Session obj : sessions) {
			if(obj.getSessionId()==sessionId) {
				sessions.remove(obj);
				break;
			}
		}
	}
	
	public Session findSession(int sessionId) {
		for (Session obj : sessions) {
			if (obj.getSessionId()==sessionId) {
				return obj;
			}
			
		}
		return null;
	}
	
	public String toString() {
		return String.format("\n---------------------\nClub Name: %-16s City: %-7s Website: %-15s\nPhone: %-8s\nMembers: %s\n\nSessions: \n%s", name, city, website, phone, members, sessions);
	}
	
	
	
	
	
	
	
	
	
	
	
}
