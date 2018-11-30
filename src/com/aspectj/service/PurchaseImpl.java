package com.aspectj.service;

import org.springframework.stereotype.Component;

import com.aspectj.inte.Purchase;

@Component
public class PurchaseImpl implements Purchase {

	@Override
	public void makeOrder() {
		System.out.print("Order make success");
	}

	@Override
	public void makePay() {
		System.out.println("pay success , waiting the goods arrival");
			throw new RuntimeException();
	}

}
