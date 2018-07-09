package com.test;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {
	
	/**
	   Outgoing Mail (SMTP) Server
	   requires TLS or SSL: smtp.gmail.com (use authentication)
	   Use Authentication: Yes
	   Port for TLS/STARTTLS: 587
	 */
	public static void main(String[] args) {
		final String fromEmail = "writetotest3@gmail.com"; //requires valid gmail id
		final String password = "gr@pje55"; // correct password for gmail id
		final String toEmail = "venkat_raman3@yahoo.com"; // can be any email id 
		
		System.out.println("TLSEmail Start");
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
		props.put("mail.smtp.port", "587"); //TLS Port
//		props.put("mail.smtp.host", "smtp.mail.yahoo.com"); //SMTP Host
//		props.put("mail.smtp.port", "587"); //TLS Port
		props.put("mail.smtp.auth", "true"); //enable authentication
		props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
		props.put("proxySet","true");
		props.put("socksProxyHost", System.getProperties().get("http.proxyHost"));
		props.put("socksProxyPort", System.getProperties().get("http.proxyPort"));
		
             //create Authenticator object to pass in Session.getInstance argument
		Authenticator auth = new Authenticator() {
			//override the getPasswordAuthentication method
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		};
		Session session = Session.getInstance(props, auth);
		
		sendEmail(session, fromEmail, toEmail,"TLSEmail Testing Subject", "TLSEmail Testing Body");
		
	}
	
	public static void sendEmail(Session session, String fromEmail, String toEmail, String subject, String body){
		try {
			
			MimeMessage msg = new MimeMessage(session);
			//set message headers
			
			msg.addHeader("format", "flowed");
			msg.addHeader("Content-Transfer-Encoding", "8bit");

			msg.setFrom(new InternetAddress(fromEmail));

			msg.setReplyTo(InternetAddress.parse(fromEmail, false));

			msg.setSubject(subject, "UTF-8");

			body = "<table style='border:2px solid black'><tr><td>Data1</td><td>Data2</td></tr></table>";
			msg.setContent(body, "text/HTML; charset=UTF-8");
			//msg.setText(body, "UTF-8");

			msg.setSentDate(new Date());

			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
			System.out.println("Message is ready");
			Transport.send(msg);  

			System.out.println("EMail Sent Successfully!!");
		}
	    catch (Exception e) {
	      e.printStackTrace();
	    }
	}

}
