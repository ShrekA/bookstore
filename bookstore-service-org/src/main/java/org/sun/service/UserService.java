package org.sun.service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sun.entity.User;
import org.sun.mapper.EmployeeMapper;
import org.sun.mapper.UserMapper;

import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.List;


/**
 * Created by Mr.sun on 2017/4/24.
 */
@Service
public class UserService extends BaseService<UserMapper, User> {
    @Override
    public void setMapper(UserMapper mapper) {
        super.mapper = mapper;
    }
    public List<HashMap<String,String>> listAll(){
        return  mapper.listAll();
    }
}
