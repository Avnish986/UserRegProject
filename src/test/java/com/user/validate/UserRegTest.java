package com.user.validate;

import org.junit.*;
import org.junit.Assert;
public class UserRegTest {
	
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad()
	{
		UserRegistration moodAnalyser = new UserRegistration();
		String mood = moodAnalyser.analyseMood("This is Sad message");
		Assert.assertEquals("SAD", mood);
	}
	//@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy()
	{
		UserRegistration moodAnalyser = new UserRegistration();
		String mood = moodAnalyser.analyseMood("This is Happy message");
		Assert.assertEquals("HAPPY", mood);
	}
	//@Test
	public void givenFname_WhenProper_ShouldReturnTrue()
    {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateFirstName("Avnish");
    	Assert.assertTrue(result);
    }
	//@Test
    public void givenFname_WhenProper_ShouldReturnFalse()
    {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateFirstName("avnish");
		Assert.assertFalse(result);
    }
	//@Test
    public void givenLname_WhenProper_ShouldReturnTrue()
    {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateLastName("Gupta");
    	Assert.assertTrue(result);
    }
	//@Test
    public void givenLname_WhenProper_ShouldReturnFalse()
    {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateLastName("gupta");
    	Assert.assertFalse(result);
    }
	//@Test
    public void givenEmail_WhenProper_ShouldReturnTrue()
    {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateEmail("abc@gmail.com");
    	Assert.assertTrue(result);
    }
	//@Test
    public void givenEmail_WhenProper_ShouldReturnFalse()
    {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateEmail("xyz@@gmail.com");
    	Assert.assertFalse(result);
    }
	//@Test
    public void givenPhNo_WhenProper_ShouldReturnTrue()
    {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validatePhno("91 8083803323");
    	Assert.assertTrue(result);
    }
	//@Test
    public void givenPhNo_WhenProper_ShouldReturnFalse()
    {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validatePhno("918083803323");
    	Assert.assertFalse(result);
    }
	//@Test
    public void givenPass_WhenProper_ShouldReturnTrue()
    {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validatePass("Tes@121313");
    	Assert.assertTrue(result);
    }
	//@Test
    public void givenPass_WhenProper_ShouldReturnFalse()
    {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validatePass("test@lfhwkf");
    	Assert.assertFalse(result);
    }
	 
}
