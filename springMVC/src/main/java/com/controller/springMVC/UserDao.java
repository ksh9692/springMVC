package com.controller.springMVC;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	@Autowired
	SqlSession sqlSessionTemplate;
	
	public int insert(Map<String, Object> map) {
		
		return this.sqlSessionTemplate.insert("user.insert", map);
	}
	
	public List<Map<String, Object>> userSelect(Map<String, Object> map) {
		
		return this.sqlSessionTemplate.selectList("user.select_user", map);
	}
}
