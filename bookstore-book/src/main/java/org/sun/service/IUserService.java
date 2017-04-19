package org.sun.service;

import org.springframework.data.domain.Page;
import org.sun.entity.User;

/**
 * Created by Mr.sun on 2017/4/18.
 */
public interface IUserService {

    User login(String account,String passwd);
    Page<User> query(User user);
    boolean update(User user);
    User add(User user);
    boolean delete(long id);

}
