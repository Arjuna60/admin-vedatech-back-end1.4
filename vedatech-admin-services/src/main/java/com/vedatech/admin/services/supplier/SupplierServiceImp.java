package com.vedatech.admin.services.supplier;


import com.vedatech.admin.supplier.Supplier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImp implements SupplierService{

    public final SupplierDao supplierDao;

    public SupplierServiceImp(SupplierDao supplierDao) {
        this.supplierDao = supplierDao;
    }

    @Override
    public List<Supplier> findAll() {
        return null;
    }

    @Override
    public Supplier findById(Long aLong) {
        return null;
    }

    @Override
    public Supplier save(Supplier object) {
        return null;
    }

    @Override
    public void delete(Supplier object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    public void saveAll(List<Supplier> suppliers){
        supplierDao.saveAll(suppliers);
    }
}
