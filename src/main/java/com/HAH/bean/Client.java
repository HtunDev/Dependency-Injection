package com.HAH.bean;

public class Client {

	private MyService myService;

	public Client(MyService myService) {
		this.myService = myService;
	}

	public void ClientWork() {
		myService.work();
	}
}
