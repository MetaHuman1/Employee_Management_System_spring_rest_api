package com.brkksh.springrestapi.controller;

import com.brkksh.springrestapi.model.Employee;
import com.brkksh.springrestapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Value("${app.name}")
    private String appName;
    @Value("${app.version}")
    private String appVersion;
    @GetMapping("version")
    public String getAppDetails() {
        return appName + " - " + appVersion;
    }
    @GetMapping("employees")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/employees/{id}")
    public String getEmployee(@PathVariable("id") Long id) {
        return "Fetching the employee details for the id " + id;
    }

    @PostMapping("/employees")
    public String saveEmployee(@RequestBody Employee employee) {
        return "Saving the employee details to the database " + employee;
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employee) {
        System.out.println("updating the employee data for the id " + id);
        return employee;
    }

    @DeleteMapping("/employees")
    public String deleteEmployee(@RequestParam("id") Long id) {
        return "Deleting the employee details for the id " + id;
    }
}


















