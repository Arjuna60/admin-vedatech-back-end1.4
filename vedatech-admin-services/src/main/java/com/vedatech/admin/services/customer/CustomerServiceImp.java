package com.vedatech.admin.services.customer;


import com.vedatech.admin.customer.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService{

    public final CustomerDao customerDao;

    public CustomerServiceImp(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }


    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public Customer findById(Long aLong) {
        return null;
    }

    @Override
    public Customer save(Customer object) {
        return null;
    }

    @Override
    public void delete(Customer object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void saveAll(List<Customer> object) {
            customerDao.saveAll(object);
    }
}
