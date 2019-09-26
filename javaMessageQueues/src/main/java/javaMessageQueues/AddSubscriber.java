package javaMessageQueues;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.events.SQSEvent;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.SubscribeRequest;

public class AddSubscriber {

    public void addSubscriber(Number subscribersPhoneNumber) {
        // Subscribe an email endpoint to an Amazon SNS topic.
        final SubscribeRequest subscribeRequest = new SubscribeRequest("arn:aws:sns:us-west-2:020439733516" +
                ":taskComplete", "sms", subscribersPhoneNumber.number);
        AmazonSNS snsClient = AmazonSNSClient.builder().build();
        snsClient.subscribe(subscribeRequest);

    }
}
