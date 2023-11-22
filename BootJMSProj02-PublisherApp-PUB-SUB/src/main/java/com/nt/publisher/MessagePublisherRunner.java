package com.nt.publisher;

import java.util.Date;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessagePublisherRunner implements CommandLineRunner {

	@Autowired
	private JmsTemplate template;
	
	@Override
	public void run(String... args) throws Exception {
			
		template.send("mq1",ses->ses.createTextMessage("From Sender :: "+new Date()));
		System.out.println("Publisher has sent message");
		
	}

}
