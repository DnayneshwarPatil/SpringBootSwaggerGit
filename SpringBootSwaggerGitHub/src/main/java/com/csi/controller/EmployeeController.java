package com.csi.controller;


import com.csi.dao.EmployeeDao;
import com.csi.model.Employee;
import com.csi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeService employeeServiceImpl;

    @PostMapping("/adddata")

    public ResponseEntity<String> addData(@RequestBody Employee employee)
    {

        employeeServiceImpl.addData(employee);

        return ResponseEntity.ok("Data Successfully");
    }

  @PostMapping("/getdatabyusinganyinput")

    public  ResponseEntity<List<Employee>> getDataByUsingAnyInput(@RequestBody Employee employee)
  {

      return ResponseEntity.ok(employeeServiceImpl.getDataByUsingAnyInput(employee));
  }


}
