package com.test;

import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.InitialContext;

public class TestQ {
	
	public static void main(String[] args) {
		try {
			Message message = null;
			TextMessage textMessage = (TextMessage) message;
			String mqMessageText = textMessage.getText();

			String[] splittedString = mqMessageText.split(",");
			String ssn = splittedString[0];
			String creditScore = splittedString[1];

			String data="<eventmsg><event processApp=\"MQAPP\" ucaname=\"Credit Check UCA\">creditScoreMessage</event><parameters><parameter><key>customerSSN</key><value>" 
					+ ssn + "</value></parameter><parameter><key>creditScore</key><value>"  
					+ creditScore + "</value></parameter></parameters></eventmsg>";

			System.out.println(" to send data" +"\n"+data);
			InitialContext ctx=new InitialContext();
			QueueConnectionFactory ucaqcf=(QueueConnectionFactory)ctx.lookup
					("javax.jms.QueueConnectionFactory");
			Queue ucaqueue=(Queue)ctx.lookup("jms/eventqueue");
			QueueConnection connection=ucaqcf.createQueueConnection
					("bpmdeadmin", "bpmdeadmin");
			Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
			MessageProducer producer = session.createProducer(ucaqueue);
			TextMessage sendUCAMessage = session.createTextMessage();
			sendUCAMessage.setText(data);
			producer.send(sendUCAMessage);

			System.out.println("UCAMessage Sent");                                
		} catch (Exception e) {
	              e.printStackTrace();
	          }
	}

}
