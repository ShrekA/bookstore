package org.sun.api;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;
import org.sun.entity.Department;
import org.sun.entity.User;
import org.sun.service.DeptService;
import org.sun.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mr.sun on 2017/4/24.
 */

@RestController
@RequestMapping("/dept/*")
public class DeptController {

    @Autowired
    DeptService deptService;


    @ApiOperation(value = "获取部门列表", notes = "")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页码", paramType = "path", required = true, dataType = "int"),
            @ApiImplicitParam(name = "rows", value = "每页条数，默认10条", paramType = "path", required = true, dataType = "int")
    })
    @RequestMapping(value = "list/{page}/{rows}", method = {RequestMethod.POST, RequestMethod.GET})
    public PageInfo<Department> list(Department dept, @PathVariable("page") int page, @PathVariable("rows") int rows) {
        PageHelper.startPage(page, rows);
        List<Department> list = deptService.queryAll(dept);
        return new PageInfo<Department>(list);
    }

    @ApiOperation(value = "创建部门", notes = "根据User对象创建部门")
    @ApiImplicitParam(name = "dept", value = "部门详细实体dept", required = true, dataType = "Department")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@RequestBody Department dept) {
        return deptService.save(dept);
    }

    @ApiOperation(value = "更新部门详细信息", notes = "根据url的id来指定更新对象，并根据传过来的Department信息来更新部门详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "部门ID", paramType = "path", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "Department", value = "部门详细实体Department", required = true, dataType = "Department")
    })
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String update(@PathVariable int id, @RequestBody Department dept) {
        dept.setId(id);
        return deptService.save(dept);
    }

    @ApiOperation(value = "获取部门详细信息", notes = "根据url的id来获取部门详细信息")
    @ApiImplicitParam(name = "id", value = "部门ID", paramType = "path", required = true, dataType = "int")
    @RequestMapping(value = "find/{id}", method = RequestMethod.GET)
    public Department find(@PathVariable int id) {
        return deptService.find(id);
    }

    @ApiOperation(value = "删除部门", notes = "根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "部门ID", paramType = "path", required = true, dataType = "int")
    @RequestMapping(value = "del/{id}", method = RequestMethod.GET)
    public String del(@PathVariable int id) {
        return deptService.del(id);
    }
}
