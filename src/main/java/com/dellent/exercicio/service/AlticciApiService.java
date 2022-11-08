package com.dellent.exercicio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class AlticciApiService {
	
	List<Integer> numList = new ArrayList<>();
	
	@Cacheable("alticciSequence")
	public List<Integer> alticciSequence(Integer n){
		int i = 0;
				
		while(i <= n) {				
			numList.add(sequence(i));
			System.out.println(numList.get(i));
			i++;
		}		
			
		return numList;
	}
	
	public int sequence(int num) {
		
		switch(num) {
			case 0:
				return 0;				
			case 1:
				return 1;				
			case 2:
				return 1;				
			default:
				return numList.get(num-3) + numList.get(num-2);			
		}
	}

}
