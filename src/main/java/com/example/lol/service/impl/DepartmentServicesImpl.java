package com.example.lol.service.impl;

import com.example.lol.entity.DepartmentEntity;
import com.example.lol.repository.DepartmentRepository;
import com.example.lol.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DepartmentServicesImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentServicesImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public List<DepartmentEntity> findAllDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public Optional<DepartmentEntity> findDepartmentById(Long id) {
        return departmentRepository.findById(id);
    }

    @Override
    public DepartmentEntity saveDepartment(DepartmentEntity departmentEntity) {
        return departmentRepository.save(departmentEntity);
    }

    @Override
    public DepartmentEntity updateDepartment(DepartmentEntity departmentEntity) {
        return departmentRepository.save(departmentEntity);
    }

    @Override
    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
}
