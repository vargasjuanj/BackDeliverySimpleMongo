package com.example.demo.service;

import java.util.List;

public interface IBaseService <E> {
	
	public E findById(String id) throws Exception;
	
	public E save(E entityForm) throws Exception;
	
	public E update(String id, E entityForm) throws Exception;
	
	public int countPages(int size) throws Exception;
	
	public List<E> findAll(int page, int size) throws Exception;
	
	public boolean delete(String id) throws Exception;
}

