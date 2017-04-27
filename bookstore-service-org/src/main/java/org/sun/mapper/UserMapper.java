package org.sun.mapper;

import org.sun.common.MyMapper;
import org.sun.entity.User;

import java.util.HashMap;
import java.util.List;

public interface UserMapper extends MyMapper<User> {
    List<HashMap<String, String>> listAll();

}