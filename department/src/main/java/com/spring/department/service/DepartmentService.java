package com.spring.department.service;

import com.spring.department.model.Department;
import com.spring.department.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private  DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department findByDepartmentId(Long id) {
        return departmentRepository.findById(id).get();
    }
}
