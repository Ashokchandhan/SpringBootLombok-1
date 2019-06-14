package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@ConfigurationProperties
@Component
public class ConsolRunner implements CommandLineRunner {


	@Override
	public void run(String... args) throws Exception {

		System.out.println(my);
	}

}
