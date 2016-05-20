package com.addition;

import javax.annotation.Resource;

public class Service {
	
	@Resource
	IRepo repo;
	
	public int add(int a , int b){
		return repo.serviceAdd(a,b);
	}
}
