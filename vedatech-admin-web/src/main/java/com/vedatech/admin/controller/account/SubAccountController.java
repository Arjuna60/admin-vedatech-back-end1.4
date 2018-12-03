package com.vedatech.admin.controller.account;


import com.vedatech.admin.accounting.AccountingType;
import com.vedatech.admin.accounting.SubAccount;
import com.vedatech.admin.bank.Bank;
import com.vedatech.admin.services.accounting.sub.SubAccountDao;
import com.vedatech.admin.services.accounting.sub.SubAccountService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("api/account")
public class SubAccountController {

    public final SubAccountService subAccountService;

    public SubAccountController(SubAccountService subAccountService) {
        this.subAccountService = subAccountService;
    }


    //-------------------Create a Bank Account--------------------------------------------------------

    @RequestMapping(value = "/addSubAccount/", method = RequestMethod.POST)
    public ResponseEntity<SubAccount> createUser(@RequestBody SubAccount subAccount, UriComponentsBuilder ucBuilder) {
        //System.out.println("Creating User " + subAccount.getNameAccount() );

/*

        if (bankDao.findBankByAccountNumber(bank.getAccountNumber()) != null) {
            System.out.println("A User with name " + bank.getNameBank() + " " + bank.getAccountNumber() + " already exist");
            HttpHeaders headers = new HttpHeaders();
            headers.set("error ", "bank account already exist");
            return new ResponseEntity<Bank>(headers, HttpStatus.CONFLICT);
        }
*/


        subAccountService.save(subAccount);
     //  SubAccount newsubAccount = subAccountService.findBankByAccountNumber(bank.getAccountNumber());

        HttpHeaders headers = new HttpHeaders();
        headers.set("accepted ok","bank account is ok");

        return new ResponseEntity<SubAccount>(headers, HttpStatus.CREATED);
    }



    //-------------------Retrieve All Sub-Accounts--------------------------------------------------------

    @RequestMapping(value = "/getAllSubAccounts/", method = RequestMethod.GET)
    public ResponseEntity<List<SubAccount>> getAllSubAcc() {
        HttpHeaders headers = new HttpHeaders();
        List<SubAccount> accountNames = (List<SubAccount>) subAccountService.findAll();

        if (accountNames.isEmpty()) {
            headers.set("error", "no existen cuentas bancarias");
            return new ResponseEntity<List<SubAccount>>(headers, HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }


        return new ResponseEntity<List<SubAccount>>(accountNames, HttpStatus.OK);
    }



}
