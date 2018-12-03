package com.vedatech.admin.services.accounting.type;

import com.vedatech.admin.accounting.AccountingType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountingTypeDao extends CrudRepository<AccountingType, Long> {


}
