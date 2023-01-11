package com.dias.randomlykafka.messaging.producer;

import com.dias.randomlykafka.model.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomerProducer {

    private static final String BIND_NAME = "customerConsumer-out-0";


    private final StreamBridge streamBridge;

    public void produce(Customer customer) {
        streamBridge.send(BIND_NAME, customer);
    }

}
