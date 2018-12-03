package com.vedatech.admin.services.accounting.sub;


import com.vedatech.admin.accounting.SubAccount;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SubAccountServiceImp implements SubAccountService{

    public final SubAccountDao subAccountDao;

    public SubAccountServiceImp(SubAccountDao subAccountDao) {
        this.subAccountDao = subAccountDao;
    }

    @Override
    public List<SubAccount> findAll() {
        return (List<SubAccount>) subAccountDao.findAll();
    }

    @Override
    public SubAccount findById(Long aLong) {
        return subAccountDao.findById(aLong).get();
    }

    @Override
    public SubAccount save(SubAccount object) {
        return subAccountDao.save(object);
    }

    @Override
    public void delete(SubAccount object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void saveAll(List<SubAccount> object) {

    }
}
