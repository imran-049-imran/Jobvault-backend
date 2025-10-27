package hrms.hrms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.EmployerService;
import hrms.hrms.core.utilities.DataResult;
import hrms.hrms.core.utilities.Result;
import hrms.hrms.dto.EmployeeDto;
import hrms.hrms.dto.request.EmployerRegisterRequest;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/employees")
public class EmployersController {
	
    @Autowired
	 EmployerService employerService;


	@PostMapping("/register")
	public Result register(@Valid @RequestBody EmployerRegisterRequest request) {
		return employerService.register(request);
	}

	@GetMapping("/getAll")
	public DataResult<List<EmployeeDto>> getAll() {
		return employerService.getAll();
	}

}
