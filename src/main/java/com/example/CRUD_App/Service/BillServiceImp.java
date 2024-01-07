package com.example.CRUD_App.Service;

import com.example.CRUD_App.Entity.Bill;
import com.example.CRUD_App.Entity.CustomerTable;
import com.example.CRUD_App.Model.FullBill;
import com.example.CRUD_App.Repository.BillDAO;
import com.example.CRUD_App.Repository.CustomerDAO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillServiceImp implements BillService{
    @Autowired
    CustomerDAO customertable;
    @Autowired
    BillDAO billdao;
    @Transactional
    @Override
    public FullBill save(FullBill fb)
    {

        Bill bill = new Bill();
        Long quantity=fb.getQuantity();
        bill.setProductName(fb.getProductName());
        bill.setCustomerName(fb.getName());
        bill.setQuantity(fb.getQuantity());

        bill.setTotalPrice((fb.getPrice()*quantity));

        Long Billid = billdao.save(bill).getBillId();

       CustomerTable customer = new CustomerTable();
      //  CustomerTable customer=null;  // checking the ACID property without using @Transaction
        customer.setCustomerId(Billid);
        customer.setCustomerName(fb.getName());
        customertable.save(customer);
       return fb;
    }
}
