package com.user.validate;

import org.junit.*;
import org.junit.Assert;
import org.junit.rules.ExpectedException;
public class UserRegTest {

	@Test
	public void givenFname_WhenProper_ShouldReturnTrue()
    {
		
		UserRegistration userValidatorFirst = new UserRegistration();
		boolean result = false;
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegistrationException.class);
			result = userValidatorFirst.firstname.validate("Avnish");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Assert.assertTrue(result);
    }
	@Test
    public void givenFname_WhenProper_ShouldReturnFalse()
    {
		UserRegistration userValidatorFirst = new UserRegistration();
		boolean result = false;
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegistrationException.class);
			result = userValidatorFirst.firstname.validate("avnish");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertFalse(result);
    }
	@Test
    public void givenLname_WhenProper_ShouldReturnTrue()
    {
		UserRegistration userValidatorLast = new UserRegistration();
		boolean result = false;
		try {
			result = userValidatorLast.lastname.validate("Gupta");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Assert.assertTrue(result);
    }
	@Test
    public void givenLname_WhenProper_ShouldReturnFalse()
    {
		UserRegistration userValidatorLast = new UserRegistration();
		boolean result = false;
		try {
			result = userValidatorLast.lastname.validate("gupta");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Assert.assertFalse(result);
    }
	@Test
    public void givenEmail_WhenProper_ShouldReturnTrue()
    {
		UserRegistration userValidatorEmail = new UserRegistration();
		boolean result = false;
		try {
			result = userValidatorEmail.emailid.validate("abc@gmail.com");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Assert.assertTrue(result);
    }
	@Test
    public void givenEmail_WhenProper_ShouldReturnFalse()
    {
		UserRegistration userValidatorEmail = new UserRegistration();
		boolean result = false;
		try {
			result = userValidatorEmail.emailid.validate("xyz@@gmail.com");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Assert.assertFalse(result);
    }
	@Test
    public void givenPhNo_WhenProper_ShouldReturnTrue()
    {
		UserRegistration userValidatorPh = new UserRegistration();
		boolean result = false;
		try {
			result = userValidatorPh.phNo.validate("91 8083803323");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Assert.assertTrue(result);
    }
	@Test
    public void givenPhNo_WhenProper_ShouldReturnFalse()
    {
		UserRegistration userValidatorPh = new UserRegistration();
		boolean result = false;
		try {
			result = userValidatorPh.phNo.validate("918083803323");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Assert.assertFalse(result);
    }
	@Test
    public void givenPass_WhenProper_ShouldReturnTrue()
    {
		UserRegistration userValidatorPass = new UserRegistration();
		boolean result = false;
		try {
			result = userValidatorPass.password.validate("Tes@121313");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Assert.assertTrue(result);
    }
	@Test
    public void givenPass_WhenProper_ShouldReturnFalse()
    {
		UserRegistration userValidatorPass = new UserRegistration();
		boolean result = false;
		try {
			result = userValidatorPass.password.validate("test@lfhwkf");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Assert.assertFalse(result);
    }
	 
}
