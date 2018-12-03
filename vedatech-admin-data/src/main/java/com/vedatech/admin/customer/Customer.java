package com.vedatech.admin.customer;


import com.vedatech.admin.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "customers")
public class Customer extends BaseEntity {

    private Long supplierId;
    private String supplierName;
    private Date initialdate;
    private String country;
    private Long pinCode;
    private String email;

    public Customer() {
    }

    public Customer(Long supplierId, String supplierName, Date initialdate, String country, Long pinCode, String email) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.initialdate = initialdate;
        this.country = country;
        this.pinCode = pinCode;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "supplierId=" + supplierId +
                ", supplierName='" + supplierName + '\'' +
                ", initialdate=" + initialdate +
                ", country='" + country + '\'' +
                ", pinCode=" + pinCode +
                ", email='" + email + '\'' +
                '}';
    }
}
