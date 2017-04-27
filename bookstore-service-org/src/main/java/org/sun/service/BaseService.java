package org.sun.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.sun.common.MyMapper;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Mr.sun on 2017/4/26.
 */
public abstract class BaseService<M extends MyMapper<T>, T extends Serializable> {

    String parseRs(int resultInt, JSONObject result) {
        if (resultInt > 0) {
            result.put("success", true);
            result.put("msg", "成功");
        } else {
            result.put("success", false);
            result.put("msg", "失败");
        }
        return result.toJSONString();
    }

    @Autowired
    M mapper;

    public String save(@NotNull T t) {
        int resultInt = mapper.insert(t);
        JSONObject result = new JSONObject();
        return parseRs(resultInt, result);
    }

    public String del(@NotNull int id) {
        int resultInt = mapper.deleteByPrimaryKey(id);
        JSONObject result = new JSONObject();
        return parseRs(resultInt, result);
    }

    public T find(@NotNull int id) {
        return mapper.selectByPrimaryKey(id);
    }

    public List<T> queryAll(@NotNull T t) {
        return mapper.select(t);
    }


    public M getMapper() {
        return mapper;
    }

    public abstract void setMapper(M mapper);


}
