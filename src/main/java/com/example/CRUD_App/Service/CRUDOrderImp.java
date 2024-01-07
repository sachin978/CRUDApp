package com.example.CRUD_App.Service;

import com.example.CRUD_App.Entity.OrderTable;
import com.example.CRUD_App.Error.CustomerNotFoundException;
import com.example.CRUD_App.Repository.OrderDAO;
import jakarta.persistence.criteria.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CRUDOrderImp implements CRUD_Order {
    @Autowired
    private  OrderDAO order;
    private List<OrderTable> OT;
    public CRUDOrderImp(OrderDAO orderDAO) {
        this.order = orderDAO;
        this.OT = order.findAll();

    }
    @Override
    public OrderTable Insert(OrderTable t1)
    {
       return  order.save(t1);
       // return t1;
    }

    @Override
    public List<OrderTable> getAllOrders() {
        return order.findAll();
    }

    @Override
    public List<OrderTable> deleteByID(long l) {
        OrderTable temp= order.getOne(l);
        order.delete(temp);
        return order.findAll() ;
        //return null;
    }

    @Override
    public OrderTable update(OrderTable t1,Long id) {

     for(OrderTable t : OT)
        {
            if(t.getId()==id)
            {

                t.setName(t1.getName());
                t.setId(t1.getId());
                t.setProductName(t1.getProductName());
                t.setProductType(t1.getProductType());
              //  System.out.println("check Done");
                order.save(t);
                return t;
            }
        }
        System.out.println("Not Found!");
        return null;
    }

    @Override
    public OrderTable getCustomerById(long id) throws CustomerNotFoundException {

        Optional<OrderTable> customer = order.findById(id);
        if(!customer.isPresent())
        {
            throw new CustomerNotFoundException("Customer Not available");
        }
        return customer.get();


    }

}

