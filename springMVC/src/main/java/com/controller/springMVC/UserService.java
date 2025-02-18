package com.controller.springMVC;

import java.util.List;
import java.util.Map;

public interface UserService {

	int userInsert(Map<String, Object> map);

	List<Map<String, Object>> userSelect(Map<String, Object> map);
	

}
