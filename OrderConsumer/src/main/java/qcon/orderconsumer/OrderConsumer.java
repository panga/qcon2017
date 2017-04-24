package qcon.orderconsumer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Sink.class)
public class OrderConsumer {

    @StreamListener(Sink.INPUT)
    public void consumerOrder(final String order) throws InterruptedException {
        System.out.println("Processing Order (v1): " + order);
        Thread.sleep(100);
    }
}
