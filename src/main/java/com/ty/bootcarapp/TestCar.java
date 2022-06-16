package com.ty.bootcarapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCar {

	@PostMapping("/savecar")
	public String save(@RequestBody Car car) {
		return "Hi The " + car.getName() + " of " + car.getBrand() + " brand car is Saved";

	}

	@GetMapping("/getallcar")
	public List<Car> getAllCar() {
		List<Car> cars = new ArrayList<Car>();

		Car car1 = new Car();
		car1.setId(100);
		car1.setName("Harrier");
		car1.setBrand("TATA");
		car1.setColor("White");
		car1.setCost(1200000);

		Car car2 = new Car();
		car2.setId(101);
		car2.setName("Scorpio");
		car2.setBrand("Mahendra");
		car2.setColor("Green");
		car2.setCost(1000000);

		Car car3 = new Car();
		car3.setId(102);
		car3.setName("Audi-A6");
		car3.setBrand("Audi");
		car3.setColor("Navy");
		car3.setCost(4000000);

		cars.add(car1);
		cars.add(car2);
		cars.add(car3);

		return cars;

	}

	@GetMapping("/getcar/{id}")
	public String getCarById(@PathVariable int id) {
		return "Car Id is " + id;

	}

	@GetMapping("/getcar")
	public String getCarByName(@RequestParam String name) {
		return "Car Name is " + name;
	}

}
