package com.github.mybatis.dao;

import com.github.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface UserMapper {
    List<User> queryUserByArr(List<Integer> list);



    /**
     * 根据用户名和id查询用户
     * @param name
     * @param role
     * @return
     */
    List<User> queryUserByUserNameAndUserRole(@Param("userName") String name,@Param("userRole") Integer role);

    /**
     * 根据用户id更改用户名称
     * @param user
     * @return
     */
    int updateUserByUserId(User user);
}
