package com.vedatech.admin.services.accounting.type;

import com.vedatech.admin.accounting.AccountingType;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AccountingTypeServiceImp implements AccountingTypeService {

    public final AccountingTypeDao accountingTypeDao;

    public AccountingTypeServiceImp(AccountingTypeDao accountingTypeDao) {
        this.accountingTypeDao = accountingTypeDao;
    }

    @Override
    public List<AccountingType> findAll() {
        return (List<AccountingType>) accountingTypeDao.findAll();
    }

    @Override
    public AccountingType findById(Long aLong) {
        return accountingTypeDao.findById(aLong).get();
    }

    @Override
    public AccountingType save(AccountingType object) {
        return accountingTypeDao.save(object);
    }

    @Override
    public void delete(AccountingType object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void saveAll(List<AccountingType> object) {
        accountingTypeDao.saveAll(object);
    }
}
