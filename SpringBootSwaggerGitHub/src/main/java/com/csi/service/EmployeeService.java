package com.csi.service;

import com.csi.model.Employee;

import java.util.List;

public interface EmployeeService {

    public void  addData(Employee employee);

    public List<Employee> getDataByUsingAnyInput(Employee employee);
}
