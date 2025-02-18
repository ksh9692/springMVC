package com.controller.springMVC;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
	@Autowired
	SqlSession sqlSessionTemplate;
	
	public int insert(Map<String, Object> map) {
		
		return this.sqlSessionTemplate.insert("book.insert", map);
	}
	
	public Map<String, Object> selectDetail(Map<String, Object> map){
		
		return this.sqlSessionTemplate.selectOne("book.select_detail", map);
	}

	public int update(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.update("book.update", map);
	}
	
	public int delete(Map<String, Object> map) {  
		return this.sqlSessionTemplate.delete("book.delete", map);  
	}
	
	public List<Map<String, Object>> selectList(Map<String, Object> map) {
		
		return this.sqlSessionTemplate.selectList("book.select_list", map);  
	}  
}
