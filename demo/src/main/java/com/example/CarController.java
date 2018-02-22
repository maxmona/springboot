package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.impl.JPACarDAO;
import com.example.dto.CarDTO;

@RestController
@RequestMapping("/cars/v1/")
public class CarController {
	
	@Autowired
	private JPACarDAO carRepository;
	
	@RequestMapping(path="getCars")
	public @ResponseBody Iterable<CarDTO> getAllCars() {
		return carRepository.findAll();
	}
}
