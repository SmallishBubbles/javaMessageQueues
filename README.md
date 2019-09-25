# Message Queues

## How to Run:

### Receiver
We created a lambda to be triggered by SQS anytime there are messages in the queue it will handle all messages by console logging the message body to cloudwatch.  Producer is still being run locally.


### Producer
Run the ProducerTest at /test/java/javaMessageQueues/ProducerTest
__***This will run infinitely until you manually stop the test__


## Resources
[AWS Docs](https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/examples-sqs-messages.html)
[AWS Docs](https://docs.aws.amazon.com/lambda/latest/dg/with-sqs-create-package.html#with-sqs-example-deployment-pkg-java)

## Screen Shots
![CloudWatch Log](/CloudWatchScreenShot.png)

## Collab
Chris Coulon
Marisha Hoza