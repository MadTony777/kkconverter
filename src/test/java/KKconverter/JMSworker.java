package kkconverter;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;

import javax.jms.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public final class JMSworker extends BaseClass {




    public static String jmsPublisher (String policyId, String fileName, String environment) throws JMSException, IOException {
        String url="";
        switch (environment){
            case "stage": url = "tcp://192.168.66.196:61616";
                break;
            case "test": url = "tcp://192.168.66.194:61616";
                break;
        }
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
        Destination destination = new ActiveMQQueue(queue);
        Connection connection = connectionFactory.createConnection();
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        MessageProducer producer = session.createProducer(destination);
        TextMessage message = session.createTextMessage();
        String paths = "./src/test/java/kkconverter/products/";
        String rightString1 = new String(Files.readAllBytes(Paths.get(paths + fileName)), StandardCharsets.UTF_8);
        String rightString = rightString1.replace("${ID}", policyId).replace("${NUMBER}", policyId);
        System.out.println("message send with CID: " + policyId);
        message.setText(rightString);
        producer.send(message);
        connection.close();
        return policyId;
    }

}