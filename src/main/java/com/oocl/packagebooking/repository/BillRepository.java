package com.oocl.packagebooking.repository;

import com.oocl.packagebooking.Model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository <Bill,String> {
    public Bill findById(Long BillId);
}
