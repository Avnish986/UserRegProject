package com.user.validate;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistrationProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to User registration");
		System.out.println("Enter First Name");
		Scanner s=new Scanner(System.in);
		String fname=s.nextLine();
		Pattern pattern=Pattern.compile("^[A-Z]{1}[a-z]{2,}");
		Matcher matcher=pattern.matcher(fname);

		boolean matchFound=matcher.find();
		if(matchFound)
		{
		System.out.println("Valid");
		}
		else
		System.out.println("Invalid");
		}
	}


