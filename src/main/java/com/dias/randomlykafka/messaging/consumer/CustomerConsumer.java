package com.dias.randomlykafka.messaging.consumer;

import com.dias.randomlykafka.model.Customer;
import com.dias.randomlykafka.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

@Component
@RequiredArgsConstructor
@Slf4j
public class CustomerConsumer implements Consumer<List<Customer>> {

    private final CustomerService customerService;

    @Override
    public void accept(List<Customer> customers) {

        log.info("Quantity {}", customers.size());
        customers.forEach(customerService::doSomething);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
