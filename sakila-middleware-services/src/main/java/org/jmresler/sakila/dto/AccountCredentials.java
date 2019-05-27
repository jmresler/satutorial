package org.jmresler.sakila.dto;

public class AccountCredentials {
	
	private String username;
	private String password;

	public AccountCredentials() {
		username = "";
		password = "";
	}
	
	/**
	 * 
	 * @return
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * 
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * 
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AccountCredentials [username=" + username + ", password=" + password + ", getUsername()="
				+ getUsername() + ", getPassword()=" + getPassword() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}