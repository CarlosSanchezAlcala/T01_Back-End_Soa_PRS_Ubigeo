package com.soa.canete.ubigeo.address.service.impl;

import com.soa.canete.ubigeo.address.domain.dto.AddressResponseDto;
import com.soa.canete.ubigeo.address.domain.mapper.AddressMapper;
import com.soa.canete.ubigeo.address.domain.model.Address;
import com.soa.canete.ubigeo.address.repository.AddressRepository;
import com.soa.canete.ubigeo.address.service.AddressService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.Comparator;

@Slf4j
@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    final AddressRepository addressRepository;

    @Override
    public Flux<AddressResponseDto> findAll() {
        return this.addressRepository.findAll()
                .sort(Comparator.comparing(Address::getCodubi).reversed())
                .map(AddressMapper::toDto);
    }
}
