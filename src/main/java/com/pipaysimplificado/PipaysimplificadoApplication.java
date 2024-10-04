package com.pipaysimplificado;

import com.pipaysimplificado.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PipaysimplificadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PipaysimplificadoApplication.class, args);
	}

}
