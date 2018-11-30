package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aspectj.inte.Purchase;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/properties/springaspecjConfig.xml" })
public class TestPurchase {
	
	@Autowired
	Purchase purchase;
	
	@Test
	public void test(){
		try {
			purchase.makeOrder();
			purchase.makePay();
			
		} catch (Exception e) {
		}
	}

}
