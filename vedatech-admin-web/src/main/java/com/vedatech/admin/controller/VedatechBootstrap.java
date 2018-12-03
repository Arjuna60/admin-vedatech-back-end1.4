package com.vedatech.admin.controller;


import com.vedatech.admin.accounting.AccountingType;
import com.vedatech.admin.accounting.SubAccount;
import com.vedatech.admin.services.accounting.sub.SubAccountService;
import com.vedatech.admin.services.accounting.type.AccountingTypeDao;
import com.vedatech.admin.services.accounting.type.AccountingTypeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class VedatechBootstrap implements CommandLineRunner {

    private final AccountingTypeService accountingTypeService;
    private final SubAccountService subAccountService;

    public VedatechBootstrap(AccountingTypeService accountingTypeService, SubAccountService subAccountService) {
        this.accountingTypeService = accountingTypeService;
        this.subAccountService = subAccountService;
    }

    @Override
    public void run(String... args) throws Exception {


        AccountingType accountingType = new AccountingType();
        accountingType.setName("Bancos Nacionales");
        accountingType.setAccount("1000000000");
        accountingType.setBalance(40000.25);

        accountingTypeService.save(accountingType);

        AccountingType cuentasAccType = new AccountingType();
        cuentasAccType.setAccount("1000000001");
        cuentasAccType.setName("Caja");
        cuentasAccType.setBalance(15655.25);

        accountingTypeService.save(cuentasAccType);


        SubAccount subAccount = new SubAccount();

        subAccount.setAccountNumber("100010001");
        subAccount.setNameAccount("Santander Serfin");
        subAccount.setBalance(10000.53);

        AccountingType accountingType1 = accountingTypeService.findById(2L);

        subAccount.setAccountType(accountingType);

        SubAccount bancos = new SubAccount();
        bancos.setAccountNumber("100010002");
        bancos.setNameAccount("Banorte IXE");
        bancos.setBalance(45256.23);
        bancos.setAccountType(accountingType1);

              subAccountService.save(subAccount);
              subAccountService.save(bancos);



    }
}
