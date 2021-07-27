package com.example.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.VO.ResponseTemplateVO;
import com.example.user.entity.SBUser;
import com.example.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public SBUser saveUser(@RequestBody SBUser user ) {
		return userService.saveUser(user);
	}
	
	@GetMapping("/{userId}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable Long userId ) {
		ResponseTemplateVO vo = userService.getUserWithDepartment(userId);
		System.out.println("USer:"+vo.getUser().toString());
		System.out.println("Department:"+vo.getDepartment().toString());
		return vo;
	}
	
}
