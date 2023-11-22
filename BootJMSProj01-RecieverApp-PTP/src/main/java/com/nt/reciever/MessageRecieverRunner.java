package com.nt.reciever;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageRecieverRunner {

	
	@JmsListener(destination = "mq1")
	public void showMessage(String text) {
		System.out.println("Message :: "+text);
	}
		
	

}
