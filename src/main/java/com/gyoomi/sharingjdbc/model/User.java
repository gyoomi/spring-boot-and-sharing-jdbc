/**
 * Copyright © 2020, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.sharingjdbc.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户 - Model
 *
 * @author Leon
 * @date 2020-06-28 10:16
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_user")
public class User
{
	private Long id;
	private String userName;
	private String nickName;
	private String address;
	private Integer age;
	private String remark;
}
