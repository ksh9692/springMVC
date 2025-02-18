package com.controller.springMVC;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDao UserDao;
	
	@Override
	public int userInsert(Map<String, Object> map) {
		System.out.println("여기에요 userInsert");
		System.out.println("Data map : " + map);
		
		int count = this.UserDao.insert(map);
	    
	    return count;
	}
	
	@Override
	public List<Map<String, Object>> userSelect(Map<String, Object> map){  
		System.out.println("여기에요 userSelect");
		System.out.println("Data map : " + map);
		System.out.println("return : " + UserDao.userSelect(map).toArray());
		
		return UserDao.userSelect(map);   
	}
}
