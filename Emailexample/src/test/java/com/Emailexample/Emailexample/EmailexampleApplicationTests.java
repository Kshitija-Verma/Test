package com.Emailexample.Emailexample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootTest
class EmailexampleApplicationTests {
	@Autowired
	private EmailController emailController;

	@Test
	void contextLoads() {
	}
	@Test
	public void testSendMail(){

		emailController.sendEmail();
	}

}
