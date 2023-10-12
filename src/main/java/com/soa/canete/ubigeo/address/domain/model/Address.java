package com.soa.canete.ubigeo.address.domain.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ubigeo")
public class Address {

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

    public Address(String depar, String provi, String distri, String status) {
        this.depar = depar;
        this.provi = provi;
        this.distri = distri;
        this.status = status;
    }
}
