package com.mycompany.model;

import java.util.List;

import com.mycompany.model.entity.User;

public interface UserManagement {

	public List<User> findAll();
	
	public List<User> getPage(Integer pageNumber, Integer numberOfItems, String orderBy);
	
	public Integer count();
}
