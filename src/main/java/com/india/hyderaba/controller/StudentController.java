package com.india.hyderaba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.india.hyderaba.model.Student;
import com.india.hyderaba.service.StudentServiceImpl;


@RestController
public class StudentController {
	@Autowired
	StudentServiceImpl ssl;
	
	@RequestMapping(value="/students",method=RequestMethod.POST,produces="applicatiion/json",consumes="application/json")
	public Student addStudent(@RequestBody Student s){
		return ssl.addStudent(s);
		
	}
	
	@RequestMapping(value="/student/{id}",method=RequestMethod.DELETE,produces="text/palin")
	public String deleteStudent(@PathVariable("id") Integer id){
		return ssl.deleteStudent(id);

	}
	
	@RequestMapping(value="/students/{id}",method=RequestMethod.GET,produces="application/json")	
	public Student getStudent(@PathVariable("id") Integer id){
		return ssl.getStudent(id);
	}
	
		
	@RequestMapping(value="/students",method=RequestMethod.PUT,produces="application/json",consumes="application/json")
	public  Student updateStudent(@RequestBody Student s){
		return ssl.updateStudent(s);
		
	}

}
