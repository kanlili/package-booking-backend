package com.oocl.packagebooking.Service;

import com.oocl.packagebooking.Model.Bill;
import com.oocl.packagebooking.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {
      @Autowired
      private BillRepository billRepository;
      public Bill addBill(Bill bill){
         return billRepository.save(bill);
      }
      public List<Bill> findAllBill(){
        return billRepository.findAll();
      }
      public Bill updateState(Long BillId,Bill bill){
          Bill billone=billRepository.findById(BillId);
          billone.setState(bill.getState());
          billRepository.save(billone);
          return  billone;
      }

}
