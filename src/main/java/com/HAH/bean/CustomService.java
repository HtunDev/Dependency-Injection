package com.HAH.bean;

import org.springframework.stereotype.Component;

@Component
public class CustomService extends MyService{

	@Override
	public void work() {
		System.out.println("Custom Work");
	}

	
}
