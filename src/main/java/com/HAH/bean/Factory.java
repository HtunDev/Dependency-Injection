package com.HAH.bean;

public class Factory {
	
	public Client generate(MyService myService) {
		var client = new Client();
		client.setMyService(myService);
		return client;
	}

}
