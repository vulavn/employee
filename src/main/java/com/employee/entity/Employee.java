package com.employee.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "employee")
public class Employee {
    private long empId;

    private String empName;
    private String job;
    private Float salary;

    private Department department;
    private Set<Employee> employees = new HashSet<Employee>(0);

    public Employee() {
    }

    public Employee(Long empId, String empName, String job, float salary, Department department) {
        this.empId = empId;
        this.empName = empName;
        this.job = job;
        this.salary = salary;
        this.department = department;
    }

    @Id
    @GeneratedValue
    @Column(name = "EMP_ID")
    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    @Column(name = "EMP_NAME", length = 50, nullable = false)
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Column(name = "JOB", length = 30, nullable = false)
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Column(name = "SALARY", nullable = false)
    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEPT_ID", nullable = false)
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "empId")
    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

}