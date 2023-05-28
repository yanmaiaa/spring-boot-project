package br.com.damasceno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicrosserviceConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrosserviceConfigServerApplication.class, args);
	}

}
