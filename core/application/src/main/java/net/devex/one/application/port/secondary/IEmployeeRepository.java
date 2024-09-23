package net.devex.one.application.port.secondary;

import com.acb.nwf.domain.entity.Employee;

import java.util.List;

public interface IEmployeeRepository {

    void save(Employee employee);

    List<Employee> getAllEmployees();
}
