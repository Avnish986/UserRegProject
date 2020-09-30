package com.user.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	private final String F_NAME="^[A-Z]{1}[a-z A-Z]{2,}$";
	private final String L_NAME="^[A-Z]{1}[a-z A-Z]{2,}$";
	private final String EMAIL_ID="^abc([.+_-]{0,1}[0-9a-z]+)?@[a-z0-9]+(\\.[a-z]{2,}){1,2}$";
	private final String PH_NO="^[0-9]{2}[ ]{1}[0-9]{10}$";
	private final String PASS="^(?=.{8,})([a-z]*)(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).*$";
	
	public boolean validateFirstName(String fname) throws UserRegistrationException
	{
		boolean matched = false;
		
		Pattern pattern=Pattern.compile(F_NAME);		
		Matcher matcher=pattern.matcher(fname);
		matched=matcher.find();
		if(matched)
			System.out.println(fname + " valid fname");

		if(!matched)
				throw new UserRegistrationException("Please enter valid first name");
		
		return matched;
	
		
		
	}
	public boolean validateLastName(String lname) throws UserRegistrationException
	{
		Pattern pattern=Pattern.compile(L_NAME);		
		Matcher matcher=pattern.matcher(lname);
		boolean matched=matcher.find();
		if(matched)
			System.out.println(lname + " valid lname");
		else
			throw new UserRegistrationException("Please enter valid last name");
		return matched;
	}
	public boolean validateEmail(String email) throws UserRegistrationException
	{
		Pattern pattern=Pattern.compile(EMAIL_ID);		
		Matcher matcher=pattern.matcher(email);
		boolean matched=matcher.find();
		if(matched)
			System.out.println(email + " valid email");
		else
			throw new UserRegistrationException("Please enter valid email");
		return matched;
	}
	public boolean validatePhno(String phno) throws UserRegistrationException
	{
		Pattern pattern=Pattern.compile(PH_NO);		
		Matcher matcher=pattern.matcher(phno);
		boolean matched=matcher.find();
		if(matched)
			System.out.println(phno + " valid phno");
		else
			throw new UserRegistrationException("Please enter valid PHONE NO.");
		return matched;
	}
	public boolean validatePass(String pass) throws UserRegistrationException
	{
		Pattern pattern=Pattern.compile(PASS);		
		Matcher matcher=pattern.matcher(pass);
		boolean matched=matcher.find();
		if(matched)
			System.out.println(pass + " valid password");
		else
			throw new UserRegistrationException("Please enter valid password");
		return matched;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Page");
	
		
		
	}

}