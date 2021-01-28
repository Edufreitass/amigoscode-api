package com.amigoscode.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	private final StudentRepository repository;

	@Autowired
	public StudentService(StudentRepository repository) {
		this.repository = repository;
	}

	public List<Student> getStudents() {
		return repository.findAll();
	}

}
