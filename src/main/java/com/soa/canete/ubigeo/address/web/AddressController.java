package com.soa.canete.ubigeo.address.web;

import com.soa.canete.ubigeo.address.domain.dto.AddressResponseDto;
import com.soa.canete.ubigeo.address.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping(value = "/api/address")
@RequiredArgsConstructor
public class AddressController {

    public final AddressService addressService;

    @GetMapping("/listData")
    public Flux<AddressResponseDto> findAll(){
        return this.addressService.findAll();
    }
}
