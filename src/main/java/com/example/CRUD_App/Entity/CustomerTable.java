package com.example.CRUD_App.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
public class CustomerTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long CustomerId;
    private String CustomerName;

    public CustomerTable() {
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long customerId) {
        CustomerId = customerId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public CustomerTable(Long customerId, String customerName) {
        CustomerId = customerId;
        CustomerName = customerName;
    }

    @Override
    public String toString() {
        return "CustomerTable{" +
                "CustomerId=" + CustomerId +
                ", CustomerName='" + CustomerName + '\'' +
                '}';
    }
}
