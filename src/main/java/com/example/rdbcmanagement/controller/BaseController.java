package com.example.rdbcmanagement.controller;


import com.example.rdbcmanagement.domain.UserDO;
import com.example.rdbcmanagement.utils.ShiroUtils;
import org.springframework.stereotype.Controller;

@Controller
public class BaseController {
	public UserDO getUser() {
		return ShiroUtils.getUser();
	}

	public Long getUserId() {
		return getUser().getUserId();
	}

	public String getUsername() {
		return getUser().getUsername();
	}
}