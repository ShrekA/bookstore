package org.sun.api;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;
import org.sun.entity.User;
import org.sun.service.UserService;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Mr.sun on 2017/4/24.
 */
@RestController
@RequestMapping("/user/*")
public class UserController {

    @Autowired
    UserService userService;


    @ApiOperation(value = "获取用户列表", notes = "")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页码", paramType = "path", required = true, dataType = "int"),
            @ApiImplicitParam(name = "rows", value = "每页条数，默认10条", paramType = "path", required = true, dataType = "int")
    })
    @RequestMapping(value = "list/{page}/{rows}", method = {RequestMethod.POST, RequestMethod.GET})
    public PageInfo<User> list(User user, @PathVariable("page") int page, @PathVariable("rows") int rows) {
        PageHelper.startPage(page, rows);
        List<User> list = userService.queryAll(user);
        return new PageInfo<User>(list);
    }

    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@RequestBody User user) {
        return userService.save(user);
    }

    @ApiOperation(value = "更新用户详细信息", notes = "根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", paramType = "path", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    })
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String update(@PathVariable int id, @RequestBody User user) {
        user.setId(id);
        return userService.save(user);
    }

    @ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", paramType = "path", required = true, dataType = "int")
    @RequestMapping(value = "find/{id}", method = RequestMethod.GET)
    public User find(@PathVariable int id) {
        return userService.find(id);
    }

    @ApiOperation(value = "删除用户", notes = "根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "用户ID", paramType = "path", required = true, dataType = "int")
    @RequestMapping(value = "del/{id}", method = RequestMethod.GET)
    public String del(@PathVariable int id) {
        return userService.del(id);
    }

    @ApiOperation(value = "列出所有用户", notes = "")
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<HashMap<String, String>> listAll() {
        return userService.listAll();
    }


    @ApiOperation(value = "用户登录", notes = "")
    @PostMapping("/login")
    public User login(String account, String passwd) {
        return userService.login(account, passwd);
    }
}
