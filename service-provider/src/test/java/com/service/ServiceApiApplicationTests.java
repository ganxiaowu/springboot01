package com.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:provider.xml")
public class ServiceApiApplicationTests {

	@Test
	public void contextLoads() {
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
