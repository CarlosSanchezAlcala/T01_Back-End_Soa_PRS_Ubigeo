package com.soa.canete.ubigeo.address.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.io.Serial;
import java.io.Serializable;


@Data
@AllArgsConstructor
public class AddressResponseDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 8222253670338491507L;

    @Id
    private String codubi;
    @Column
    private String depar;
    @Column
    private String provi;
    @Column
    private String distri;
    @Column
    private String status;
}
