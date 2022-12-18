package com.infybuzz.feignclient;

import com.infybuzz.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "${address.service.url}", value = "address-feign-client")
public interface AddressFeignClient {
    @GetMapping("/getById/{id}")
    public AddressResponse getById(@PathVariable long id);
}
