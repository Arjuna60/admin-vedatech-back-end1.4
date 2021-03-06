package com.vedatech.admin.accounting;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vedatech.admin.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Entity
@Table(name = "accounting_type")
public class AccountingType extends BaseEntity {

    private String name;
    private String account;
    private Double balance;

    //@OneToMany(cascade=CascadeType.ALL, mappedBy = "accountingType", fetch = FetchType.LAZY, orphanRemoval = true)
   //  @JsonIgnoreProperties("accountingType")
    // private List<SubAccount> subAccount;


    @Override
    public String toString() {
        return "AccountingType{" +
                "name='" + name + '\'' +
                ", account='" + account + '\'' +
                ", balance=" + balance +
                '}';
    }
}
