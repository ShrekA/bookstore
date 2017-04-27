package org.sun.service;

import org.springframework.stereotype.Service;
import org.sun.entity.Department;
import org.sun.mapper.DepartmentMapper;

/**
 * Created by Mr.sun on 2017/4/24.
 */
@Service
public class DeptService extends BaseService<DepartmentMapper, Department> {
    @Override
    public void setMapper(DepartmentMapper mapper) {
        super.mapper = mapper;
    }
}
