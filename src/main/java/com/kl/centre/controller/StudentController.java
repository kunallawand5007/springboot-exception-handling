/**
 * 
 */
package com.kl.centre.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kl.centre.pojo.Student;
import com.kl.centre.pojo.UserNotFoundException;

/**
 * @author kunal.lawand
 *
 */
@RestController
public class StudentController {

	public List<Student> students = new ArrayList<Student>();

	@PostConstruct
	public void init() {
		this.createStudents();
	}

	@RequestMapping(value = "/students", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<List<Student>> getStudents() {
		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
	}

	@RequestMapping(value = "/student/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<Student> getStudent(@PathVariable(value = "id") Integer id) {

		Student student = students.stream().filter(st -> st.getRollNo()==id).findAny().orElse(null);
		if (student == null) {
			throw new UserNotFoundException("User Not Found ...!!!");
		}

		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}

	public void createStudents() {

		Student student = new Student();
		student.setRollNo(1);
		student.setName("Akshay");
		student.setCity("Pune");

		Student one = new Student();
		one.setRollNo(2);
		one.setName("Akshay");
		one.setCity("Pune");

		Student second = new Student();
		second.setRollNo(3);
		second.setName("Akshay");
		second.setCity("Pune");

		students.add(one);
		students.add(second);
		students.add(student);

	}

}
