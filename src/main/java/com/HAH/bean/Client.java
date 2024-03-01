package com.HAH.bean;

public class Client {

	private MyService myService;

	public void setMyService(MyService myService) {
		this.myService = myService;
	}

	public void ClientWork() {
		myService.work();
	}
}
