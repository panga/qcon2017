package qcon.orderproducer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OrderProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderProducerApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(OrderProducer producer) {
        return (evt) -> {
            producer.produceOrders();
        };
    }
}
