package com.ty.bootcarapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test1 {

	@GetMapping("/eat")
	public String eat() {
		return "Hi Eat Briyani";

	}

	@GetMapping("/drink")
	public String drink() {
		return "Drink Water";

	}
}
