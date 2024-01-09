package com.example.CRUD_App.Repository;

import com.example.CRUD_App.Entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillDAO extends JpaRepository<Bill,Long>
{

}
