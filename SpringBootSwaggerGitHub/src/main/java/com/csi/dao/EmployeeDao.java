package com.csi.dao;

import com.csi.model.Employee;

import java.util.List;

public interface EmployeeDao {


    public void  addData(Employee employee);

    public List<Employee> getDataByUsingAnyInput(Employee employee);
}
