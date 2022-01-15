package com.spring.department.controller;

import com.spring.department.model.Department;
import com.spring.department.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private  DepartmentService departmentService;

    @PostMapping
    public Department SaveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findByDepartmentId(@PathVariable("id")Long id){
        return departmentService.findByDepartmentId(id);
    }
}
