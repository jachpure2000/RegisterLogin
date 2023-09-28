package com.example.registerlogin.EmpController;

import com.example.registerlogin.DTO.EmployeeDTO;
import com.example.registerlogin.DTO.LoginDTO;
import com.example.registerlogin.LoginResponse.LoginMesage;
import com.example.registerlogin.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@PostMapping(path = "/save")
	public String saveEmployee(@RequestBody EmployeeDTO employeeDTO)
	{
		String id = employeeService.addEmployee(employeeDTO);
		return id;
	}
	@PostMapping(path = "/login")
	public ResponseEntity<?> loginEmployee(@RequestBody LoginDTO loginDTO)
	{
		LoginMesage loginMesage = employeeService.loginEmployee(loginDTO);
		return ResponseEntity.ok(loginMesage);
	}
}
