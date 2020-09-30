package com.user.validate;

import org.junit.*;
import org.junit.Assert;
import org.junit.rules.ExpectedException;
public class UserRegTest {

	@Test
	public void givenFname_WhenProper_ShouldReturnTrue()
    {
		
		UserRegistration userValidator = new UserRegistration();
		boolean result = false;
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegistrationException.class);
			result = userValidator.validateFirstName("Avnish");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Assert.assertTrue(result);
    }
	@Test
    public void givenFname_WhenProper_ShouldReturnFalse()
    {
		UserRegistration userValidator = new UserRegistration();
		boolean result = false;
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegistrationException.class);
			result = userValidator.validateFirstName("avnish");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertFalse(result);
    }
	@Test
    public void givenLname_WhenProper_ShouldReturnTrue()
    {
		UserRegistration userValidator = new UserRegistration();
		boolean result = false;
		try {
			result = userValidator.validateLastName("Gupta");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Assert.assertTrue(result);
    }
	@Test
    public void givenLname_WhenProper_ShouldReturnFalse()
    {
		UserRegistration userValidator = new UserRegistration();
		boolean result = false;
		try {
			result = userValidator.validateLastName("gupta");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Assert.assertFalse(result);
    }
	@Test
    public void givenEmail_WhenProper_ShouldReturnTrue()
    {
		UserRegistration userValidator = new UserRegistration();
		boolean result = false;
		try {
			result = userValidator.validateEmail("abc@gmail.com");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Assert.assertTrue(result);
    }
	@Test
    public void givenEmail_WhenProper_ShouldReturnFalse()
    {
		UserRegistration userValidator = new UserRegistration();
		boolean result = false;
		try {
			result = userValidator.validateEmail("xyz@@gmail.com");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Assert.assertFalse(result);
    }
	@Test
    public void givenPhNo_WhenProper_ShouldReturnTrue()
    {
		UserRegistration userValidator = new UserRegistration();
		boolean result = false;
		try {
			result = userValidator.validatePhno("91 8083803323");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Assert.assertTrue(result);
    }
	@Test
    public void givenPhNo_WhenProper_ShouldReturnFalse()
    {
		UserRegistration userValidator = new UserRegistration();
		boolean result = false;
		try {
			result = userValidator.validatePhno("918083803323");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Assert.assertFalse(result);
    }
	@Test
    public void givenPass_WhenProper_ShouldReturnTrue()
    {
		UserRegistration userValidator = new UserRegistration();
		boolean result = false;
		try {
			result = userValidator.validatePass("Tes@121313");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Assert.assertTrue(result);
    }
	@Test
    public void givenPass_WhenProper_ShouldReturnFalse()
    {
		UserRegistration userValidator = new UserRegistration();
		boolean result = false;
		try {
			result = userValidator.validatePass("test@lfhwkf");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Assert.assertFalse(result);
    }
	 
}
