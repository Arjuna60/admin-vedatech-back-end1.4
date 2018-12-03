package com.vedatech.admin.services.transaction;

import com.vedatech.admin.bank.BankTransaction;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BankTransactionServiceImp implements BankTransactionService {

    public final BankTransactionDao bankTransactionDao;

    public BankTransactionServiceImp(BankTransactionDao bankTransactionDao) {
        this.bankTransactionDao = bankTransactionDao;
    }

    @Override
    public List<BankTransaction> findAll() {
        return (List<BankTransaction>) bankTransactionDao.findAll();
    }

    @Override
    public BankTransaction findById(Long aLong) {
        return null;
    }

    @Override
    public BankTransaction save(BankTransaction object) {
        return bankTransactionDao.save(object);
    }

    @Override
    public void delete(BankTransaction object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void saveAll(List<BankTransaction> object) {

    }
}
