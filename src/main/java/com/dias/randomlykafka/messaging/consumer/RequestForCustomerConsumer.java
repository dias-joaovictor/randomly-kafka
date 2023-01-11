package com.dias.randomlykafka.messaging.consumer;

import com.dias.randomlykafka.model.RequestForCustomer;
import com.dias.randomlykafka.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
@RequiredArgsConstructor
public class RequestForCustomerConsumer implements Consumer<RequestForCustomer> {

    private final CustomerService customerService;

    @Override
    public void accept(RequestForCustomer requestForCustomer) {
        customerService.startProcess(requestForCustomer.quantity());
    }
}
