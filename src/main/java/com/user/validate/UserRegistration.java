package com.user.validate;
import com.user.validate.UserRegistrationException;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@FunctionalInterface
interface Validate {
	boolean validate (String a) throws UserRegistrationException ;
	
}
public class UserRegistration {
	private final static String F_NAME="^[A-Z]{1}[a-z A-Z]{2,}$";
	private final static String L_NAME="^[A-Z]{1}[a-z A-Z]{2,}$";
	private final static String EMAIL_ID="^abc([.+_-]{0,1}[0-9a-z]+)?@[a-z0-9]+(\\.[a-z]{2,}){1,2}$";
	private final static String PH_NO="^[0-9]{2}[ ]{1}[0-9]{10}$";
	private final static String PASS="^(?=.{8,})([a-z]*)(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).*$";
	Validate firstname = (fname) -> {
		boolean matched = false;
		Pattern pattern=Pattern.compile(F_NAME);		
		Matcher matcher=pattern.matcher(fname);
		matched= matcher.find();
		if(matched)
			System.out.println(fname + " valid ");

		if(!matched)
			throw new UserRegistrationException("Please enter valid first name");
		
		return matched;
		
	};
	Validate lastname = (lname) -> {
		boolean matched = false;
		Pattern pattern=Pattern.compile(L_NAME);		
		Matcher matcher=pattern.matcher(lname);
		matched= matcher.find();
		if(matched)
			System.out.println(lname + " valid ");

		if(!matched)
			throw new UserRegistrationException("Please enter valid last name");	
		return matched;
		
	};
	Validate emailid = (email) -> {
		boolean matched = false;
		Pattern pattern=Pattern.compile(EMAIL_ID);		
		Matcher matcher=pattern.matcher(email);
		matched= matcher.find();
		if(matched)
			System.out.println(email + " valid ");

		if(!matched)
			throw new UserRegistrationException("Please enter valid email");
		return matched;
	};
	
	Validate phNo = (phno) -> {
		boolean matched = false;
		Pattern pattern=Pattern.compile(PH_NO);		
		Matcher matcher=pattern.matcher(phno);
		matched= matcher.find();
		if(matched)
			System.out.println(phno + " valid ");

		if(!matched)
			throw new UserRegistrationException("Please enter valid phNo");
		return matched;
	};
	Validate password = (pass) -> {
		boolean matched = false;
		Pattern pattern=Pattern.compile(PASS);		
		Matcher matcher=pattern.matcher(pass);
		matched= matcher.find();
		if(matched)
			System.out.println(pass + " valid");
		if(!matched)
			throw new UserRegistrationException("Please enter valid password");
		return matched;
	};
	//Using predicate functional interface
	Predicate<String> isValid  = n -> {
		Pattern pattern=Pattern.compile(PASS);		
		Matcher matcher=pattern.matcher(n);
		return matcher.find();
		
	};
	
	public static void main(String[] args) throws UserRegistrationException {
		System.out.println("Welcome to User Registration Page");
	
		
//		firstname.validate("Avnish");
//		firstname.validate("avnish");
//		lastname.validate("Gupta");
//		lastname.validate("gupta");
//		emailid.validate("131@akhd.com");
//		emailid.validate("abc@gmail.com");
//		phNo.validate("3131973131");
//		phNo.validate("91 9922222212");
//		password.validate("Tes585253");
//		password.validate("TEST@353534545");
//		isValid.test("TEST@353534545");
		
		
		
	}

	

}