package com.HAH.bean.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.HAH.bean.Client;
import com.HAH.bean.CustomService;
import com.HAH.bean.MyService;

@Configuration
public class MyConfig {
	
	@Bean
	public Client createClient() {
		return new Client();
	}
	
	@Bean
	public MyService creatMyService() {
		return new CustomService();
	}

}
