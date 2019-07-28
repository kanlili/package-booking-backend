package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.Model.Bill;
import com.oocl.packagebooking.Service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bill")
public class BillController {
    @Autowired
    private BillService billService;
   @GetMapping
   public List<Bill> getBills(){
       return  billService.findAllBill();
   }
   @PostMapping
   public Bill addBills(@RequestBody Bill bill){
       return billService.addBill(bill);
   }
   @PutMapping("/{id}")
   public Bill update(@RequestBody Long ID,Bill bill){
      return billService.updateState(ID,bill);
   }
}
