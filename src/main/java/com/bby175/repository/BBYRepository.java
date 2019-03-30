package com.bby175.repository;

import org.springframework.data.repository.CrudRepository;

import com.bby175.model.EoM;

public interface BBYRepository 
	extends CrudRepository<EoM, Long>{
	
}

