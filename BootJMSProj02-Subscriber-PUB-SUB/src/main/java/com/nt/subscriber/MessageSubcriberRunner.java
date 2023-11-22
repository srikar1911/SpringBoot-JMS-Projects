package com.nt.subscriber;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageSubcriberRunner {

	
	@JmsListener(destination = "mq1")
	public void showMessage(String text) {
		System.out.println("Message :: "+text);
	}
		
	

}
