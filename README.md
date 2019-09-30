# Message Queues SNS Implementation

## How to Run:
Trust that it works...
## [Front End](http://taskmaster-frontend-marisha.s3-website-us-west-2.amazonaws.com/)

### Add Subscriber
Code attached in pull request.  We implemted both with Java as well as JavaScript.
This lambda takes in JSON data at an API gateway endpoint and adds the phone number to the SNS topic.

### Broadcast Message
A lambda function automatically fires on database updates. If the task status has reached "Finished", the lambda sends a message to the SNS topic which sends a text to all subscribers with the task name that was completed.

______________
## SQS Features

### Receiver
We created a JavaScript Lambda that would broadcast out a message to all subscribers.  The code for this lambda is also included in our pull request.

### Producer
Run the ProducerTest at /test/java/javaMessageQueues/ProducerTest
__***This will run infinitely until you manually stop the test__

## Resources
[AWS Docs](https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/examples-sqs-messages.html)
[AWS Docs](https://docs.aws.amazon.com/lambda/latest/dg/with-sqs-create-package.html#with-sqs-example-deployment-pkg-java)
[Add A Subscriber Resource](https://docs.aws.amazon.com/sns/latest/dg/sns-tutorial-create-subscribe-endpoint-to-topic.html)
[Add A Subscriber Resource](https://aws.amazon.com/blogs/developer/client-constructors-now-deprecated/)

## Screen Shots
![CloudWatch Log](/CloudWatchScreenShot.png)

## Collab
Chris Coulon
Marisha Hoza