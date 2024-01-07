package com.example.CRUD_App.Controller;

import com.example.CRUD_App.Entity.OrderTable;
import com.example.CRUD_App.Service.NewOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Requests
{
    @Autowired
    private final NewOrder tableEntry;
    public Requests() {
        this.tableEntry = null; // You can initialize it based on your needs
    }
    public Requests(NewOrder tableEntry) {
        this.tableEntry = tableEntry;
    }

    @PostMapping("/order/add")
    public OrderTable Inserts(@RequestBody OrderTable t1)
   {
      // assert tableEntry != null;
       return tableEntry.Insert(t1);
     // return t1;
   }
   @GetMapping("/order/get")
    public List<OrderTable> getOrders()
   {
       return tableEntry.getAllOrders();
   }



}
