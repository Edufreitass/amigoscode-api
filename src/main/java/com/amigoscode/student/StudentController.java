package com.amigoscode.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

	private final StudentService service;

	@Autowired
	public StudentController(StudentService service) {
		this.service = service;
	}

	@GetMapping
	public List<Student> getStudents() {
		return service.getStudents();
	}

	@PostMapping
	public void registerNewStudent(@RequestBody Student student) {
		service.addNewStudent(student);
	}
	
	@DeleteMapping(path = "{studentId}")
	public void deleteStudent(@PathVariable("studentId") Long studentId) {
		service.deleteStudent(studentId);
	}

}
