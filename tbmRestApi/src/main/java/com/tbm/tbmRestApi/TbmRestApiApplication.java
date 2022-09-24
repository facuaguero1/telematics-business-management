package com.tbm.tbmRestApi;

import com.tbm.tbmRestApi.model.AvlState;
import com.tbm.tbmRestApi.model.Customer;
import com.tbm.tbmRestApi.model.VehicleBrand;
import com.tbm.tbmRestApi.model.repositories.AvlStateRepository;
import com.tbm.tbmRestApi.model.repositories.CustomerRepository;
import com.tbm.tbmRestApi.model.repositories.VehicleBrandRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TbmRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TbmRestApiApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner(VehicleBrandRepository vehicleBrandRepository,
										CustomerRepository customerRepository,
										AvlStateRepository avlStateRepository
										) {
		return args -> {
			/*
			avlStateRepository.save(new AvlState("Available"));
			avlStateRepository.save(new AvlState("Operational"));
			avlStateRepository.save(new AvlState("Troubleshooting pending"));
			avlStateRepository.save(new AvlState("Brand new"));
			avlStateRepository.save(new AvlState("Unusable"));
			vehicleBrandRepository.save(new VehicleBrand("Chevrolet"));
			vehicleBrandRepository.save(new VehicleBrand("Ford"));
			vehicleBrandRepository.save(new VehicleBrand("Fiat"));
			customerRepository.save(new Customer("Holcim - Planta Córdoba"));
			customerRepository.save(new Customer("Quilmes Cargo - Córdoba"));
			customerRepository.save(new Customer("MercadoLibre - Mercado Central"));*/


		};
	}

}
