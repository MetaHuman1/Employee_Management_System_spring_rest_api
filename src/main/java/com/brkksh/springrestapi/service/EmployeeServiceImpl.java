package com.brkksh.springrestapi.service;

import com.brkksh.springrestapi.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService{

    private static List<Employee> list = new ArrayList<>();
    static  {
        Employee e = new Employee();
        e.setName("sha");
        e.setAge(21L);
        e.setDepartment("IT");
        e.setEmail("sha@gmail.com");
        e.setLocation("RU");
        list.add(e);

        e = new Employee();
        e.setName("joe");
        e.setAge(24L);
        e.setDepartment("IT");
        e.setEmail("joe@gmail.com");
        e.setLocation("USA");
        list.add(e);
    }
    @Override
    public List<Employee> getEmployees() {
        return list;
    }
}
