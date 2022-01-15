package com.spring.department.repository;

import com.spring.department.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository< Department,Long >{
}
