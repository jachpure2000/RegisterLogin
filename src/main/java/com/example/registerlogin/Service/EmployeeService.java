package com.example.registerlogin.Service;

import com.example.registerlogin.DTO.EmployeeDTO;
import com.example.registerlogin.DTO.LoginDTO;
import com.example.registerlogin.LoginResponse.LoginMesage;

public interface EmployeeService {
	String addEmployee(EmployeeDTO employeeDTO);
	LoginMesage loginEmployee(LoginDTO loginDTO);
}
