package com.example.CRUD_App.Controller;

import com.example.CRUD_App.Entity.OrderTable;
import com.example.CRUD_App.Error.CustomerNotFoundException;
import com.example.CRUD_App.Model.FullBill;
import com.example.CRUD_App.Service.BillService;
import com.example.CRUD_App.Service.CRUD_Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Requests
{
    @Autowired
    private final CRUD_Order tableEntry;
    @Autowired
    private BillService billservice;
    public Requests() {
        this.tableEntry = null; // You can initialize it based on your needs
    }
    public Requests(CRUD_Order tableEntry) {
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
   @DeleteMapping("/order/delete/{id}")
    public List<OrderTable> DeleteById(@PathVariable String id)
   {
      return tableEntry.deleteByID(Long.parseLong(id));
      // return null;
   }

   @PutMapping("/order/update/{id}")
    public OrderTable update(@RequestBody OrderTable t1,@PathVariable String id)
   {
       return tableEntry.update(t1,Long.parseLong(id));
   }

   @GetMapping("/order/get/{id}")
    public OrderTable getCustomerById(@PathVariable String id) throws CustomerNotFoundException {
       return tableEntry.getCustomerById(Long.parseLong(id));
   }

   @PostMapping("order/add/bill")

    public FullBill saveDetails(@RequestBody FullBill fb)
   {
       return  billservice.save(fb);
   }

}
