package com.example.CRUD_App.Service;

import com.example.CRUD_App.Entity.OrderTable;
import com.example.CRUD_App.Repository.OrderDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewOrderImp implements NewOrder{
    @Autowired
    private  OrderDAO order;
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
}
