package com.dias.randomlykafka.messaging.consumer;

import com.dias.randomlykafka.model.Customer;
import com.dias.randomlykafka.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
@RequiredArgsConstructor
public class CustomerConsumer implements Consumer<Customer> {

    private final CustomerService customerService;

    @Override
    public void accept(Customer customer) {
        customerService.doSomething(customer);
    }
}
