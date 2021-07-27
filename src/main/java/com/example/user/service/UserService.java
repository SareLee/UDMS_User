package com.example.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.user.VO.ResponseTemplateVO;
import com.example.user.entity.Department;
import com.example.user.entity.SBUser;
import com.example.user.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public SBUser saveUser(SBUser user) {
		return userRepo.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		SBUser user = userRepo.findByUserId(userId);
		Department department = 
				
				/*
				restTemplate.getForObject("http://localhost:9001/departments/"+user.getDeptId(), 
						Department.class);*/
				restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDeptId(), 
						Department.class);
		System.out.println("Ret user:"+user.toString());
		System.out.println("Ret Dept:"+department.toString());
		vo.setUser(user);
		vo.setDepartment(department);
		return vo;
	}

}
