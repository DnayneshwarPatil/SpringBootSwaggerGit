package com.csi.service;

import com.csi.dao.EmployeeDao;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements  EmployeeService{

    @Autowired
    EmployeeDao employeeDaoImpl;


    @Override
    public void addData(Employee employee) {
        employeeDaoImpl.addData(employee);
    }

    @Override
    public List<Employee> getDataByUsingAnyInput(Employee employee) {
        return employeeDaoImpl.getDataByUsingAnyInput(employee);
    }
}
