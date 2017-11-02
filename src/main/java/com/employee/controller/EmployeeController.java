package com.employee.controller;

import com.employee.dao.DepartmentDao;
import com.employee.dao.EmployeeDao;
import com.employee.entity.Department;
import com.employee.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
@RequestMapping("employee")
public class EmployeeController {

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String listEmployee(Model model) {

        DepartmentDao departmentDao = new DepartmentDao();
        ArrayList<Department> lstDepartment = departmentDao.getAllDepartment();

        model.addAttribute("lstDepartment", lstDepartment);


        EmployeeDao employeeDao = new EmployeeDao();
        ArrayList<Employee> lstEmployee = employeeDao.getAllEmployee();

        model.addAttribute("lstEmployee", lstEmployee);

        String deptName = lstEmployee.get(0).getDepartment().getDeptName();

        return "employees";
    }
}
