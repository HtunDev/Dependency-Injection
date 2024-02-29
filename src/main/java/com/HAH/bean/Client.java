package com.HAH.bean;

public class Client {

	private MyService myService;

	public Client() {
		myService = new MyService();
	}

	public void ClientWork() {
		myService.work();
	}
}
