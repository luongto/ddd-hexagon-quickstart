package net.devex.one.application.port.primary;

import com.acb.nwf.application.dto.EmployeeDto;

import java.util.List;

public interface IEmployeeApplicationService {

    void createNewEmployee(EmployeeDto employee);

    List<EmployeeDto> getAllEmployees();
}
