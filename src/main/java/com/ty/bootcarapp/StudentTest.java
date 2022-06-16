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
public class StudentTest {

	@GetMapping("/student")
	public Student getStudent() {
		Student student = new Student();
		student.setId(100);
		student.setName("Karthi");
		student.setPercentage(84.3);
		return student;

	}

	@GetMapping("/student/{id}")
	public String studentById(@PathVariable int id) {
		return "ID is " + id;

	}

	@GetMapping("/aunty")
	public String auntyById(@RequestParam int id) {
		return "Aunty Id is " + id;

	}

	@PostMapping("/save")
	public String recieve(@RequestBody Student student) {
		return "Hi " + student.getName();

	}

	@GetMapping("/all")
	public List<Student> getAll() {
		List<Student> students = new ArrayList<Student>();

		Student student1 = new Student();
		student1.setId(100);
		student1.setName("Karthi");
		student1.setPercentage(84.3);

		Student student2 = new Student();
		student2.setId(101);
		student2.setName("Peter");
		student2.setPercentage(90.5);

		Student student3 = new Student();
		student3.setId(102);
		student3.setName("Nishanth");
		student3.setPercentage(90.5);

		students.add(student1);
		students.add(student2);
		students.add(student3);
		return students;

	}

}
