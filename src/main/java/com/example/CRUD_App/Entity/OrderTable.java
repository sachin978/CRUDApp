package com.example.CRUD_App.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OrderTable
{
    @Id
    private Long id;
    private String CustomerName;
    @Column(name = "product_name")
    private String ProductName;
    @Column(name = "product_type")
    private String ProductType;
    public OrderTable() {
    }
    public OrderTable(Long id, String name, String ProductName, String productType) {
        this.id = id;
        this.CustomerName = name;
        this.ProductName = ProductName;
        this.ProductType = productType;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return CustomerName;
    }

    public void setName(String name) {
        this.CustomerName = name;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        this.ProductName = productName;
    }

    public String getProductType() {
        return ProductType;
    }

    public void setProductType(String productType) {
        this.ProductType = productType;
    }



    @Override
    public String toString() {
        return "OrderTable{" +
                "id=" + id +
                ", name='" + CustomerName + '\'' +
                ", ProductName='" + ProductName + '\'' +
                ", ProductType='" + ProductType + '\'' +
                '}';
    }
}
