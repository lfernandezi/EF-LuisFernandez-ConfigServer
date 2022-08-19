package com.idat.EFLuisFernandezConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class EfLuisFernandezConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfLuisFernandezConfigServerApplication.class, args);
	}

}
