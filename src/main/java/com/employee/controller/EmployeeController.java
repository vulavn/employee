package com.employee.controller;

import com.employee.entity.Department;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
@RequestMapping("employee")
public class EmployeeController {

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String listEmployee(Model model) {

        ArrayList<Department> lstName = new ArrayList<>();
        lstName.add(new Department(1, "DEV"));
        lstName.add(new Department(2, "ACCOUNTANT"));
        lstName.add(new Department(3, "HR"));

        model.addAttribute("lstName", lstName);
        return "employees";
    }
}
