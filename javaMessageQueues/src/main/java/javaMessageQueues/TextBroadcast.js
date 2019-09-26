const AWS = require('aws-sdk');

exports.handler = async (event, context) => {

  AWS.config.update({region: 'us-west-2'});

  var sns = new AWS.SNS();

  const params = {
    Message: 'Hey there!!!!',
    TopicArn: 'arn:aws:sns:us-west-2:020439733516:taskComplete',
  };

  const data = await sns.publish(params,context.done).promise()

  const response = {
    statusCode: 200,
    body: JSON.stringify(data),
  };

  return response;
};
