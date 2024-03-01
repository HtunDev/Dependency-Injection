package com.HAH.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client {

	@Autowired
	private MyService myService;
	
//	public void setMyService(@Autowired MyService myService) {
//		this.myService = myService;
//	}

	public void ClientWork() {
		myService.work();
	}
}
