package com.waiter;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import jakarta.xml.ws.Endpoint;

@Configuration
public class WebServiceConfig {

    @Autowired
    public Bus bus;

    @Autowired
    public UserDataService userDataService;

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, userDataService);
        endpoint.publish("/user");
        return endpoint;
    }
}
