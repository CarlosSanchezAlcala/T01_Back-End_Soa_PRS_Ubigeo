package com.soa.canete.ubigeo.address.repository;

import com.soa.canete.ubigeo.address.domain.model.Address;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AddressRepository extends ReactiveCrudRepository<Address, String> {
}
