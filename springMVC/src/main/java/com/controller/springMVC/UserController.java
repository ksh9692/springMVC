package com.controller.springMVC;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@Autowired
	UserService UserService;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public ModelAndView login() {
		
	    return new ModelAndView("login");
	}
	/**
	 * 로그인 정보 POST
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView loginPost(@RequestParam Map<String, Object> map) {
		System.out.println("여기에요 login Post");
		System.out.println("Data Map : " + map);
	    
		ModelAndView mav = new ModelAndView();
		List<Map<String, Object>> returnVal = UserService.userSelect(map);
	    String id = returnVal.get(0).get("ID").toString();
	    
	    System.out.println("returnVal : " + returnVal.get(0).toString());
	    System.out.println(id);
	    
	    if(returnVal.size() == 1) {
	    	System.out.println("true");
	    	mav.addObject("id", id);
	    	mav.setViewName("redirect:/index");
	    }else {
	    	System.out.println("회원정보 없음");
	    	mav.setViewName("redirect:/join");
	    }
		
	    System.out.println(mav);
	    return mav;
	}
	
	/**
	 * 회원가입 페이지 진입
	 * @return
	 */
	@RequestMapping(value="/join", method = RequestMethod.GET)
	public ModelAndView join() {
		
	    return new ModelAndView("join");
	}
	
	/**
	 * 회원가입 데이터 처리
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public ModelAndView join(@RequestParam Map<String, Object> map) {
		System.out.println("여기에요 join Post");
		System.out.println("Data Map : " + map);
	    
		ModelAndView mav = new ModelAndView();
		int returnVal = UserService.userInsert(map);
	    
	    if(returnVal == 1) {
	    	System.out.println("회원가입 성공");
	    	mav.setViewName("redirect:/index");
	    }else {
	    	System.out.println("실패");
	    }
	    
	    System.out.println("return join Post Data : " + mav);
	    return mav;
	}
}
