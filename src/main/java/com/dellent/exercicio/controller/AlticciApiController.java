package com.dellent.exercicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.dellent.exercicio.api.AlticciApi;
import com.dellent.exercicio.service.AlticciApiService;

@RestController
public class AlticciApiController implements AlticciApi{
	
	@Autowired
	private AlticciApiService alticciApiService;

	@Override
	public List<Integer> alticciSequence(Integer n) {
		return alticciApiService.alticciSequence(n);		
	}

}
