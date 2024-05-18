package com.cpg.register.service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;

import com.cpg.register.model.Student;


@Service
public class DataMapper {
	
	public Context setData(List<Student> studentList) {
		Context context=new Context();
		Map<String,Object> object=new HashMap<>();
		object.put("students", studentList);
		context.setVariables(object);

		return context;
	}
	
}
