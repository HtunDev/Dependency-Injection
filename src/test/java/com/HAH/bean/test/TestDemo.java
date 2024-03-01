package com.HAH.bean.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.HAH.bean.Client;
import com.HAH.bean.Configuration.MyConfig;

@SpringJUnitConfig(classes = MyConfig.class)
public class TestDemo {
	
	@Autowired
	private Client client;
	
	@Test
	void DemoTest() {
		client.ClientWork();
	}

}
