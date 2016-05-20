package com.fournisseur.domain.service;

import javax.annotation.Resource;

import com.fournisseur.IRepo;

public class Service implements IService {
	@Resource
	IRepo repo;
	@Override
	public int add(int a, int b){
		
		return repo.serviceAdd(a, b);
	}
}
