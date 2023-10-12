package com.soa.canete.ubigeo.address.service;

import com.soa.canete.ubigeo.address.domain.dto.AddressResponseDto;
import reactor.core.publisher.Flux;

public interface AddressService {

    Flux<AddressResponseDto> findAll();

}
