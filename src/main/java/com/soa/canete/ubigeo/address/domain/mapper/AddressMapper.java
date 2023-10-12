package com.soa.canete.ubigeo.address.domain.mapper;

import com.soa.canete.ubigeo.address.domain.dto.AddressRequestDto;
import com.soa.canete.ubigeo.address.domain.dto.AddressResponseDto;
import com.soa.canete.ubigeo.address.domain.model.Address;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AddressMapper {

    public static Address toModel(AddressRequestDto address){
        return new Address(
                address.getDepar(),
                address.getProvi(),
                address.getDistri(),
                address.getStatus()
        );
    }

    public static Address toModel(String codubi, AddressRequestDto address){
        return new Address(
                codubi,
                address.getDepar(),
                address.getDistri(),
                address.getStatus(),
                address.getProvi()
        );
    }

    public static AddressResponseDto toDto(Address address){
        return new AddressResponseDto(
                address.getCodubi(),
                address.getDepar(),
                address.getProvi(),
                address.getDistri(),
                address.getStatus()
        );
    }
}
