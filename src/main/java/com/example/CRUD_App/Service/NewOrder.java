package com.example.CRUD_App.Service;

import com.example.CRUD_App.Entity.OrderTable;

import java.util.List;

public interface NewOrder
{
   public OrderTable Insert(OrderTable t1);

 public List getAllOrders();
}
