package API;

import java.util.regex.Pattern;

public class Account {
	private String username;
	private String password;
	private int identity;
	
	public Account(String aUsername, String aPassword, int anIdentity) {
		username = aUsername;
		password = aPassword;
		identity = anIdentity;
	}
	
	public boolean checkPassword() {
		if(password.length()>=8 && password.length()<=16 && password.matches(".*[a-zA-Z].*") && password.matches(".*[0-9].*") && password.matches("[a-zA-Z0-9]*"))
			return true;
		else
			return false;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public int getIdentity() {
		return identity;
	}
}
