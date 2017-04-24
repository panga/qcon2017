package qcon.orderproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(Source.class)
public class OrderProducer {

    @Autowired
    private Source source;

    public void produceOrders() throws InterruptedException {
        for (int i = 1;; i++) {
            final Order order = new Order(i, "Product " + i);
            final Message<Order> msg = MessageBuilder.withPayload(order).build();
            source.output().send(msg);
            Thread.sleep(50);
        }

    }
}
