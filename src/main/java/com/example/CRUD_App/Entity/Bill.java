package com.example.CRUD_App.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
public class Bill
{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long billId;
  private Long Quantity;
  private Long TotalPrice;
  private String ProductName;
  private String CustomerName;

  public Long getBillId() {
    return billId;
  }

  public Bill() {
  }

  public void setBillId(Long billId) {
    this.billId = billId;
  }

  public Long getQuantity() {
    return Quantity;
  }

  public void setQuantity(Long quantity) {
    Quantity = quantity;
  }

  public Long getTotalPrice() {
    return TotalPrice;
  }

  public void setTotalPrice(Long totalPrice) {
    TotalPrice = totalPrice;
  }

  public String getProductName() {
    return ProductName;
  }

  public void setProductName(String productName) {
    ProductName = productName;
  }

  public String getCustomerName() {
    return CustomerName;
  }

  public void setCustomerName(String customerName) {
    CustomerName = customerName;
  }

  public Bill(Long billId, Long quantity, Long totalPrice, String productName, String customerName) {
    this.billId = billId;
    Quantity = quantity;
    TotalPrice = totalPrice;
    ProductName = productName;
    CustomerName = customerName;
  }

  @Override
  public String toString() {
    return "Bill{" +
            "billId=" + billId +
            ", Quantity=" + Quantity +
            ", TotalPrice=" + TotalPrice +
            ", ProductName='" + ProductName + '\'' +
            ", CustomerName='" + CustomerName + '\'' +
            '}';
  }
}
