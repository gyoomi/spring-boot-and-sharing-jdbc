/**
 * Copyright © 2020, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.sharingjdbc.controller;

import com.gyoomi.sharingjdbc.model.User;
import com.gyoomi.sharingjdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户 - Controller
 *
 * @author Leon
 * @date 2020-06-28 14:13
 */
@RestController
public class UserController
{

	@Autowired
	private UserService userService;

	@GetMapping(value = "/hello")
	public String hello()
	{
		return "hello, sharding jdbc!";
	}

	@PostMapping(value = "/user")
	public String save(User user)
	{
		userService.save(user);
		return "ok";
	}

	@GetMapping(value = "/user/{id}")
	public User findById(@PathVariable Long id)
	{
		return userService.findById(id);
	}
}
