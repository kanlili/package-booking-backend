package com.oocl.packagebooking.controller;
import com.oocl.packagebooking.Model.Bill;
import com.oocl.packagebooking.repository.BillRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import static org.hamcrest.core.Is.is;

import static org.junit.Assert.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
@DataJpaTest
public class BillControllerTest {
    @Autowired
    private BillRepository repository;
    @Test
    public  void should_return_saveInfo_when_add(){
        Bill bill=new Bill("周丽","18900001111","未取件");
        repository.save(bill);
        List<Bill>bills=repository.findAll();
        assertThat(bills.size(),is(1));
    }
}
