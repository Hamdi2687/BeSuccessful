package com.mycompany.model.implimentation;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.model.UserManagement;
import com.mycompany.model.entity.User;

public class UserManagementImpl implements UserManagement{
	
	@Override
	public List<User> findAll() {
		RandomGenerator generator = new RandomGenerator();
		List<User> users = new ArrayList<User>()	;
		while (users .size()< 200 ){
			users.add(generator.getRadomUser());
		}
		return users;
	}

	@Override
	public List<User> getPage(Integer pageNumber, Integer numberOfItems, String orderBy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer count() {
		// TODO Auto-generated method stub
		return null;
	}

}
