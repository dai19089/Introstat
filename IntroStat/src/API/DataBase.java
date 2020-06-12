package API;

import java.util.*;

import javax.swing.JOptionPane;

public class DataBase {
	private ArrayList<EventsC> eventsDB = new ArrayList<>();
	private ArrayList<EventTicketC> eventTicketsDB = new ArrayList<>();
	private ArrayList<Account> accountsDB = new ArrayList<>();
	
	public DataBase() {	
	}
	
	public void setAccountInfo(String aUsername, String aPassword, int anIdentity){
		Account acc = new Account(aUsername, aPassword, anIdentity);
		accountsDB.add(acc);
	}
	
	public void setEventTicketInfo(String aHome,String anAway,String aDay,String aMonth,String aReferee,String aLocation){
		EventTicketC eveT = new EventTicketC(aHome, anAway, aDay, aMonth, aReferee, aLocation);
		eventTicketsDB.add(eveT);
	}
	
	public void setEventsInfo(int[] goal, int[] redCard, int[] yellowCard, int[] dangerousAttack, int[] attack,
			int[] leftAttack, int[] rightAttack, int[] possesion, int[] offside, int[] corner, int[] faul,
			int[] inTargetShoot, int[] outOfTargetShoot, int[] chances) {
		EventsC eve = new EventsC(goal, redCard, yellowCard, dangerousAttack, attack,	leftAttack, rightAttack, possesion,	offside, corner, faul, inTargetShoot, outOfTargetShoot,	chances);
		eventsDB.add(eve);
	}
	
	public int checkUsername(String aUsername){
		int check = 0;
		if(aUsername.length()<3 || aUsername.length()>15)
			check = 1;
		for(Account acc: accountsDB) {
			if(acc.getUsername().equals(aUsername))
				check = 2;
		}
		return check;
	}
	
	public Account findAccountByUsername(String aUsername) {
		for(Account acc: accountsDB) {
			if(acc.getUsername().equals(aUsername))
				return acc;
		}
		return null;
	}
	
	public EventsC findGame(String aHome, String anAway, String aDay, String aMonth) {
		int pos = -1;
		boolean found = false;
		for(EventTicketC eveT: eventTicketsDB) {
			pos++;
			if(eveT.getHome().equals(aHome) && eveT.getAway().equals(anAway) && eveT.getDay().equals(aDay) && eveT.getMonth().equals(aMonth)) {
				found = true;
				break;
			}
		}
		if(found)
			return eventsDB.get(pos);
		else
			return null;
	}
	
	public EventsC findLastGame() {
		return eventsDB.get(eventsDB.size()-1);
	}
	
	public EventTicketC findEventTicket(String aHome, String anAway, String aDay, String aMonth) {
		int pos = -1;
		boolean found = false;
		for(EventTicketC eveT: eventTicketsDB) {
			pos++;
			if(eveT.getHome().equals(aHome) && eveT.getAway().equals(anAway) && eveT.getDay().equals(aDay) && eveT.getMonth().equals(aMonth)) {
				found = true;
				break;
			}
		}
		if(found)
			return eventTicketsDB.get(pos);
		else
			return null;
	}
	
	public EventTicketC findLastEventTicket() {
		return eventTicketsDB.get(eventTicketsDB.size()-1);
	}
}
