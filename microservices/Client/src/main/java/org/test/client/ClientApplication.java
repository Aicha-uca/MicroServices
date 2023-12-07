package org.test.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.test.client.Model.Client;
import org.test.client.Repository.ClientRepository;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}
	@Bean
	CommandLineRunner initialiserBaseH2(ClientRepository cr){
		return args ->{
			cr.save(new Client(Long.parseLong("1"),"Samih Aicha",Float.parseFloat("12")));
			cr.save(new Client(Long.parseLong("2"),"Salwa benjelloun",Float.parseFloat("28")));
			cr.save(new Client(Long.parseLong("3"),"Samih kawtar",Float.parseFloat("22")));
		};
	}

}
