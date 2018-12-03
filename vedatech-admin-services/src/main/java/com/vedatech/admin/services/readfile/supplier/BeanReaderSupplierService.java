package com.vedatech.admin.services.readfile.supplier;

import com.vedatech.admin.supplier.Supplier;
import org.supercsv.io.ICsvBeanReader;

import java.io.IOException;
import java.util.List;

public interface BeanReaderSupplierService {

    List<Supplier> readWithCsvBeanReaderSupplier(Supplier supplier, String file) throws IOException;

}
