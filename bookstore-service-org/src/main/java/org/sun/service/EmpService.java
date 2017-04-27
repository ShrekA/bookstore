package org.sun.service;

import org.springframework.stereotype.Service;
import org.sun.entity.Employee;
import org.sun.mapper.EmployeeMapper;

/**
 * Created by Mr.sun on 2017/4/24.
 */
@Service
public class EmpService extends BaseService<EmployeeMapper, Employee> {
    @Override
    public void setMapper(EmployeeMapper mapper) {
        super.mapper = mapper;
    }

}
