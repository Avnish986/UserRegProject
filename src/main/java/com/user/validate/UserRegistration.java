package com.user.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	private final String F_NAME="^[A-Z]{1}[a-z A-Z]{2,}$";
	private final String L_NAME="^[A-Z]{1}[a-z A-Z]{2,}$";
	private final String EMAIL_ID="^abc([.+_-]{0,1}[0-9a-z]+)?@[a-z0-9]+(\\.[a-z]{2,}){1,2}$";
	private final String PH_NO="^[0-9]{2}[ ]{1}[0-9]{10}$";
	private final String PASS="^(?=.{8,})([a-z]*)(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).*$";
	
	public String analyseMood(String msg) {
		if(msg.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";
		
	}
	
	public boolean validateFirstName(String fname)
	{
		Pattern pattern=Pattern.compile(F_NAME);		
		Matcher matcher=pattern.matcher(fname);
		boolean matched=matcher.find();
		if(matched)
			System.out.println(fname + " valid fname");
		else
			System.out.println(fname + " invalid fname");
		return matched;
	}
	public boolean validateLastName(String lname)
	{
		Pattern pattern=Pattern.compile(L_NAME);		
		Matcher matcher=pattern.matcher(lname);
		boolean matched=matcher.find();
		if(matched)
			System.out.println(lname + " valid lname");
		else
			System.out.println(lname + " invalid lname");
		return matched;
	}
	public boolean validateEmail(String email)
	{
		Pattern pattern=Pattern.compile(EMAIL_ID);		
		Matcher matcher=pattern.matcher(email);
		boolean matched=matcher.find();
		if(matched)
			System.out.println(email + " valid email");
		else
			System.out.println(email +  " invalid email");
		return matched;
	}
	public boolean validatePhno(String phno)
	{
		Pattern pattern=Pattern.compile(PH_NO);		
		Matcher matcher=pattern.matcher(phno);
		boolean matched=matcher.find();
		if(matched)
			System.out.println(phno + " valid phno");
		else
			System.out.println(phno + " invalid phno");
		return matched;
	}
	public boolean validatePass(String pass)
	{
		Pattern pattern=Pattern.compile(PASS);		
		Matcher matcher=pattern.matcher(pass);
		boolean matched=matcher.find();
		if(matched)
			System.out.println(pass + " valid password");
		else
			System.out.println(pass + " invalid password");
		return matched;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Page");
	
		
		
	}

}