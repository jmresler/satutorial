package org.jmresler.sakila.entities;


/**
 * This is not an entity per-se, it's simply used to
 * transfer information using JWTS for securing the front-end
 * @author John
 *
 */
public class AccountCredentials {

	private String userName;
	private String password;
	
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AccountCredentials [userName=" + userName + ", password=" + password + "]";
	}
	
	

}
