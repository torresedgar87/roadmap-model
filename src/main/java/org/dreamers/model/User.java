package org.dreamers.model;

public class User 
{
	private int id;
	
	private String email;
	
	private String password;
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public int getId()
	{
		return id;
	}
}
