package org.spring.springboot.service;

import org.spring.springboot.domain.User;

/**
 * Created by Administrator on 2017/3/23.
 */
public interface UserService {
    User findById(Long id);
}
