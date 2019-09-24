package javaMessageQueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReceiverTest {

    @Test
    public void receiveMessage() throws InterruptedException{
        Receiver.receiveManyMessages();
    }
}