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

        String QUEUE_NAMEA = "QueueA";
        String QUEUE_NAMEB = "QueueB";
        String QUEUE_NAMEC = "QueueC";

        String queueUrlA = sqs.getQueueUrl(QUEUE_NAMEA).getQueueUrl();
        String queueUrlB = sqs.getQueueUrl(QUEUE_NAMEB).getQueueUrl();
        String queueUrlC = sqs.getQueueUrl(QUEUE_NAMEC).getQueueUrl();

        List<Message> messages = sqs.receiveMessage(queueUrlA).getMessages();

        for ( Message message : messages ) {
            System.out.println(message.getBody());
            sqs.deleteMessage(queueUrlA, message.getReceiptHandle());
        }
    }

    public static void receiveManyMessages() throws InterruptedException{
        while (true) {
            receiveMessage();
        }
    }
}
