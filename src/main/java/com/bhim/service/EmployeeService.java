package com.bhim.service;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhim.model.Address;
import com.bhim.model.Employee;
import com.bhim.repository.AddressRepository;
import com.bhim.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private AddressRepository addressRepository;

	public void saveEmployee() {

		Address address = new Address();
		address.setAddressId(1);
		address.setState("ap");
		address.setCity("Adoni");
		address.setCountry("india");

		Address address2 = new Address();
		address2.setAddressId(2);
		address2.setState("ka");
		address2.setCity("banglore");
		address2.setCountry("India");

		Employee employee = new Employee();
		employee.setEmpId(101);
		employee.setEmpName("bheema");
		employee.setEmpsalary(545555.0);

		// associating emp with address
		address.setEmp(employee);
		address2.setEmp(employee);

		// associate with address with emp
		employee.setAddr(Arrays.asList(address, address2));
		// save parent record
		employeeRepository.save(employee);
	}

	public void getEmployee() {
		Optional<Employee> byId = employeeRepository.findById(1);
		System.out.println(byId.get());
	}

	public void getaddress() {
		addressRepository.findById(1);
	}
	public void deleteEmployee() {
		employeeRepository.deleteById(1);
	}
}
