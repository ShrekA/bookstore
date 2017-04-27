package org.sun.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.sun.domain.UserDao;
import org.sun.entity.User;

import javax.transaction.Transactional;

/**
 * Created by Mr.sun on 2017/4/18.
 */
@Service
@Transactional
public class UserService implements IUserService {
    @Autowired
    UserDao userDao;
    @Override
    public User login(String account, String passwd) {
        return null;
    }

    @Override
    public Page<User> query(User user) {
        return null;
    }
    @Override
    public boolean update(User user) {
        return false;
    }
    @Override
    public User add(User user) {
        return  userDao.save(user);
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
