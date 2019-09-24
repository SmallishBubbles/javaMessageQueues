package javaMessageQueues;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.AmazonSQSException;
import com.amazonaws.services.sqs.model.Message;
import com.amazonaws.services.sqs.model.SendMessageBatchRequest;

import java.util.List;

public class Receiver {
    public static void receiveMessage() {
        AmazonSQS sqs = AmazonSQSClientBuilder.defaultClient();
        List<Message> messages = sqs.receiveMessage("https://sqs.us-west-2.amazonaws.com/798470182683/QueueA").getMessages();

        for ( Message message : messages ) {
            System.out.println(message.getBody());
            sqs.deleteMessage("https://sqs.us-west-2.amazonaws.com/798470182683/QueueA", message.getReceiptHandle());
        }
    }

    public static void receiveManyMessages() throws InterruptedException{
        while (true) {
            receiveMessage();
        }
    }
}
