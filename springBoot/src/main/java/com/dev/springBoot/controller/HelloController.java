package com.dev.springBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dev.springBoot.service.HelloService;

@Controller
public class HelloController {
	
	@Autowired
	HelloService service;
	
	// / 요청을 받으면 hello.jsp를 반환
		// properties 파일에 jsp의 경로가 등록
		// /WEB-INF/views/hello.jsp
	@GetMapping("/")
	private String hello(String user_id, Model model) {
		// 파라메터 수집
		System.out.println("user_id : " + user_id);
		// 사용자 이름 조회
		String username = service.getMember(user_id);
		// 화면에 전달 하기 위해서는 model객체에 저장
		System.out.println("username : " + username);
		model.addAttribute("username",username);
		return "hello";

	} 
}
