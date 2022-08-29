package com.example.lol.entity;


import javax.persistence.*;

@Entity
@Table(name = "Department")
public class DepartmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Dept_id")
    private Long id;

    @Column(name = "Dept_name")
    private String Dept_name;

    @Column(name = "Dept_loc")
    private String Dept_Location;

    @Column(name = "Dept_num_of_worker")
    private Long Dept_num_of_worker;

    public DepartmentEntity() {
    }

    public DepartmentEntity(String dept_name, String dept_Location, Long dept_num_of_worker) {
        Dept_name = dept_name;
        Dept_Location = dept_Location;
        Dept_num_of_worker = dept_num_of_worker;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDept_name() {
        return Dept_name;
    }

    public void setDept_name(String dept_name) {
        Dept_name = dept_name;
    }

    public String getDept_Location() {
        return Dept_Location;
    }

    public void setDept_Location(String dept_Location) {
        Dept_Location = dept_Location;
    }

    public Long getDept_num_of_worker() {
        return Dept_num_of_worker;
    }

    public void setDept_num_of_worker(Long dept_num_of_worker) {
        Dept_num_of_worker = dept_num_of_worker;
    }
}
