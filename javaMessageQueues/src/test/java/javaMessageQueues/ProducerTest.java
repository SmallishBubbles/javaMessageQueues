package javaMessageQueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProducerTest {

    @Test
    public void sendMessage() throws InterruptedException{
        Producer.sendManyMessages();
    }
}