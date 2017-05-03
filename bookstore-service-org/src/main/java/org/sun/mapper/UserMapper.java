package org.sun.mapper;

import org.apache.ibatis.annotations.Param;
import org.sun.common.MyMapper;
import org.sun.entity.User;

import java.util.HashMap;
import java.util.List;

public interface UserMapper extends MyMapper<User> {
    List<HashMap<String, String>> listAll();

    User findUser(@Param("account") String account,@Param("passwd") String passwd);
}