package com.vedatech.admin.services.readfile.customer;

import com.vedatech.admin.customer.Customer;
import com.vedatech.admin.services.readfile.GetProcessorService;
import com.vedatech.admin.services.readfile.beanreader.BeanReaderService;
import com.vedatech.admin.supplier.Supplier;
import org.springframework.stereotype.Service;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.ICsvBeanReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class BeanReaderCustomerServiceImp implements BeanReaderCustomerService {

    public final BeanReaderService beanReaderService;
    public final GetProcessorService getProcessorService;

    public BeanReaderCustomerServiceImp(BeanReaderService beanReaderService, GetProcessorService getProcessorService) {
        this.beanReaderService = beanReaderService;
        this.getProcessorService = getProcessorService;
    }

    @Override
    public List<Customer> readWithCsvBeanReaderCustomer(Customer object, String file) throws IOException {

        ICsvBeanReader beanReader = null;
        List<Customer> customers = new ArrayList<>();
        try {
            beanReader = beanReaderService.readWithCsvBeanReader(Supplier.class, file);
            final String[] header = beanReader.getHeader(true);
            final CellProcessor[] processors = getProcessorService.getCustomerProcessors();
            customers = beanReaderService.BeanReaderSave(Customer.class, beanReader,processors,header);

        } finally {
            if (beanReader != null) {
                beanReader.close();
            }
            return customers;
        }
    }

}
