package com.cpg.register.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cpg.register.model.Student;
import com.cpg.register.repository.StudentRepository;

@ExtendWith(SpringExtension.class)
public class StudentServiceTest {
	@InjectMocks
	private StudentService studentService;
	
	@Mock
	private StudentRepository studentRepository;
	
	@Test
	public void testAddStudent() {
		studentService=new StudentService();
	Student student=new Student();
	student.setId(11);
	student.setName("Amar");
	student.setAge("28");
	student.setCity("pune");
	student.setMobile("897930");
	student.setEmail("amar@gmail.com");
	student.setGender("male");
	student.setRole("user");
	student.setPassword("1234");
	//Mockito.lenient().doNothing().when(Mockito.any());
//	studentService.addStudent(student);
	//Assertions.assertNotNull(student);
	}

}
