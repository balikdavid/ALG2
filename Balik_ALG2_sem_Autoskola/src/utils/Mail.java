package utils;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author David Bálik
 */
public class Mail {

    public static void sendMail(String recipient, String statistics) throws MessagingException {
        Properties properties = new Properties();

        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        
        
        String myEmail = "balik.dav@gmail.com";
        String password = "Mtfbwy0425";
        
        Session session = Session.getInstance(properties, new Authenticator(){
            
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(myEmail, password); 
            }
        });
        
        Message message = newMessage(session, myEmail,recipient, statistics);
        Transport.send(message);
        
        
    }

    private static Message newMessage(Session session, String myEmail, String recipient, String statistics) throws MessagingException {
        Message message;
        message = new MimeMessage(session);
        message.setFrom(new InternetAddress(myEmail));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
        message.setSubject("Autoškola - statistiky");
        message.setText(statistics);
        return message;

    }
    
  
}
