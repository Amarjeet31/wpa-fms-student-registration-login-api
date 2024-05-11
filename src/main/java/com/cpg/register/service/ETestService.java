package com.cpg.register.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cpg.register.model.Etest;
import com.cpg.register.model.Test;
import com.cpg.register.repository.ETestRepository;

@Service
public class ETestService {
	@Autowired
	private ETestRepository testRepository;
	
	public List<Etest> getData(){
		List<Etest> list= (List<Etest>) testRepository.findAll();
		return list;
	}
	
	public int getScore(Test test) {
		int score=0;
		if(test.getTest1().equals("true")) {
			score=score+20;
		}if(test.getTest2().equals("true")) {
			score=score+20;
		}
		if(test.getTest3().equals("true")) {
			score=score+20;
		}
		if(test.getTest4().equals("true")) {
			score=score+20;
		}
		if(test.getTest5().equals("true")) {
			score=score+20;
		}
		return score;
	}

}
