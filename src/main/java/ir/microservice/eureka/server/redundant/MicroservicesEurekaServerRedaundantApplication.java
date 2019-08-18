package ir.microservice.eureka.server.redundant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroservicesEurekaServerRedaundantApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesEurekaServerRedaundantApplication.class, args);
	}
	
}
