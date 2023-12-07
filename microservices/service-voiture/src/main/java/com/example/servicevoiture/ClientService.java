package com.example.servicevoiture;

import com.example.servicevoiture.Model.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "service-client")
public interface ClientService {

    @GetMapping("/clients/{clientId}")
    Client clientById(@PathVariable("clientId") Long clientId);
}
