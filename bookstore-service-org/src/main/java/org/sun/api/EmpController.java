package org.sun.api;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.sun.entity.Employee;
import org.sun.service.EmpService;

import java.util.List;

/**
 * Created by Mr.sun on 2017/4/24.
 */
@RestController
@RequestMapping("/emp/*")
public class EmpController {

    @Autowired
    EmpService empService;


    @ApiOperation(value = "获取员工列表", notes = "")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页码", paramType = "path", required = true, dataType = "int"),
            @ApiImplicitParam(name = "rows", value = "每页条数，默认10条", paramType = "path", required = true, dataType = "int")
    })
    @RequestMapping(value = "list/{page}/{rows}", method = {RequestMethod.POST, RequestMethod.GET})
    public PageInfo<Employee> list(Employee employee, @PathVariable("page") int page, @PathVariable("rows") int rows) {
        PageHelper.startPage(page, rows);
        List<Employee> list = empService.queryAll(employee);
        return new PageInfo<Employee>(list);
    }

    @ApiOperation(value = "创建员工", notes = "根据Employee对象创建员工")
    @ApiImplicitParam(name = "employee", value = "员工详细实体Employee", required = true, dataType = "Employee")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@RequestBody Employee employee) {
        return empService.save(employee);
    }

    @ApiOperation(value = "更新员工详细信息", notes = "根据url的id来指定更新对象，并根据传过来的Employee信息来更新员工详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "员工ID", paramType = "path", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "employee", value = "员工详细实体Employee", required = true, dataType = "Employee")
    })
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String update(@PathVariable int id, @RequestBody Employee employee) {
        employee.setId(id);
        return empService.save(employee);
    }

    @ApiOperation(value = "获取员工详细信息", notes = "根据url的id来获取员工详细信息")
    @ApiImplicitParam(name = "id", value = "员工ID", paramType = "path", required = true, dataType = "int")
    @RequestMapping(value = "find/{id}", method = RequestMethod.GET)
    public Employee find(@PathVariable int id) {
        return empService.find(id);
    }

    @ApiOperation(value = "删除员工", notes = "根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "员工ID", paramType = "path", required = true, dataType = "int")
    @RequestMapping(value = "del/{id}", method = RequestMethod.GET)
    public String del(@PathVariable int id) {
        return empService.del(id);
    }
}
