package com.alp54.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alp54.domain.Hello;

@Repository
public interface HelloRepository extends CrudRepository<Hello, Long> {
	
	List<Hello> findByMessage(String message);

}
