package com.example.CRUD_App.Repository;

import com.example.CRUD_App.Entity.CustomerTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDAO extends JpaRepository<CustomerTable,Long> {

}
