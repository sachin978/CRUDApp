package com.example.CRUD_App.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class FullBill
{
   private String name;
   private String productName;
   private String productType;
   private Long price;
   private Long quantity;

   public FullBill(String name, String productName, String productType, Long price, Long quantity) {
      this.name = name;
      this.productName = productName;
      this.productType = productType;
      this.price = price;
      this.quantity = quantity;
   }

   @Override
   public String toString() {
      return "FullBill{" +
              "name='" + name + '\'' +
              ", productName='" + productName + '\'' +
              ", productType='" + productType + '\'' +
              ", price=" + price +
              ", quantity=" + quantity +
              '}';
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getProductName() {
      return productName;
   }

   public void setProductName(String productName) {
      this.productName = productName;
   }

   public String getProductType() {
      return productType;
   }

   public void setProductType(String productType) {
      this.productType = productType;
   }

   public Long getPrice() {
      return price;
   }

   public void setPrice(Long price) {
      this.price = price;
   }

   public Long getQuantity() {
      return quantity;
   }

   public void setQuantity(Long quantity) {
      this.quantity = quantity;
   }

   public FullBill() {
   }
}
