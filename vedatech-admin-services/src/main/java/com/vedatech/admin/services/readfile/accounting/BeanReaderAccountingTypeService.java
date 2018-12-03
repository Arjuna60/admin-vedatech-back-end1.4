package com.vedatech.admin.services.readfile.accounting;

import com.vedatech.admin.accounting.AccountingType;
import com.vedatech.admin.bank.BankTransaction;

import java.io.IOException;
import java.util.List;

public interface BeanReaderAccountingTypeService {

    List<AccountingType> readWithCsvBeanReaderAccountingType(AccountingType obj, String file) throws IOException;

}
