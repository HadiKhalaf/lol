package com.example.lol.controller;

import com.example.lol.entity.DepartmentEntity;
import com.example.lol.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping
    public List<DepartmentEntity> findAllDepartment(){
        return departmentService.findAllDepartment();
    }

    @GetMapping("/{id}")
    public Optional<DepartmentEntity> findDepartmentById(@PathVariable("id") Long id){
        return departmentService.findDepartmentById(id);
    }

    @PostMapping
    public DepartmentEntity saveDepartment(@RequestBody DepartmentEntity departmentEntity){
        return departmentService.saveDepartment(departmentEntity);
    }

    @PutMapping
    public DepartmentEntity updateDepartment(@RequestBody DepartmentEntity departmentEntity){
        return departmentService.updateDepartment(departmentEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteDepartment(@PathVariable("id") Long id){
        departmentService.deleteDepartment(id);
    }
}
