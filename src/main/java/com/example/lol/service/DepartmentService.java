package com.example.lol.service;

import com.example.lol.entity.DepartmentEntity;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    List<DepartmentEntity> findAllDepartment();
    Optional<DepartmentEntity> findDepartmentById(Long id);
    DepartmentEntity saveDepartment(DepartmentEntity departmentEntity);
    DepartmentEntity updateDepartment(DepartmentEntity departmentEntity);
    void deleteDepartment(Long id);
}
