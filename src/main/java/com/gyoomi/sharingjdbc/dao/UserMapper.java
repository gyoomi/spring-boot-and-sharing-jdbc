/**
 * Copyright © 2020, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.sharingjdbc.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gyoomi.sharingjdbc.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户 - Mapper
 *
 * @author Leon
 * @date 2020-06-28 10:18
 */
@Mapper
public interface UserMapper extends BaseMapper<User>
{

}
