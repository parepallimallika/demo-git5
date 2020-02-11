package com.india.hyderaba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.india.hyderaba.model.Student;
import com.india.hyderaba.repository.StudentRepository;


@Service
public class StudentServiceImpl {
	
	//mallika
	@Autowired
	StudentRepository studentRepository;
	
	public Student addStudent(Student s){
		return studentRepository.save(s);
	}
	
	public String deleteStudent(Integer id){
		studentRepository.deleteById(id);
		return "success";
		
	}
	
	public Student getStudent(Integer id){
		return studentRepository.findById(id).get();
	}
	
	public Student updateStudent(Student s){
		return studentRepository.save(s);
		
	}


}
