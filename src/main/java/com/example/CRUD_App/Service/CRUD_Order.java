package com.example.CRUD_App.Service;

import com.example.CRUD_App.Entity.OrderTable;
import com.example.CRUD_App.Error.CustomerNotFoundException;

import java.util.List;

public interface CRUD_Order
{
   public OrderTable Insert(OrderTable t1);

 public List getAllOrders();

  public  List<OrderTable> deleteByID(long l);

   public OrderTable update(OrderTable t1, Long id);

   public OrderTable getCustomerById(long l) throws CustomerNotFoundException;
}
