/**
 * Copyright © 2020, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.sharingjdbc.service;

import com.gyoomi.sharingjdbc.dao.UserMapper;
import com.gyoomi.sharingjdbc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户 - Service
 *
 * @author Leon
 * @date 2020-06-28 10:20
 */
@Service
public class UserService
{

	@Autowired
	private UserMapper userMapper;

	public void save(User user)
	{
		userMapper.insert(user);
	}

	public User findById(Long id)
	{
		return userMapper.selectById(id);
	}
}
