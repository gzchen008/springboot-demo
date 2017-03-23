package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.User;

/**
 * Created by Administrator on 2017/3/23.
 */
public interface UserDao {
    User findById(@Param("id") Long id);
}
