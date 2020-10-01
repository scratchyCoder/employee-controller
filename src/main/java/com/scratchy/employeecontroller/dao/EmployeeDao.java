package com.scratchy.employeecontroller.dao;

import java.util.List;

import com.scratchy.employeecontroller.model.Employee;

public interface EmployeeDao {
    
    public void saveOrUpdateEmployee(Employee employee);
    public List<Employee> getEmployees();
    public void deleteEmployeeById(int id);

}