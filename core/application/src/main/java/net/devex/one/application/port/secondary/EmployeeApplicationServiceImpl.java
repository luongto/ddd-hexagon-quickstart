package net.devex.one.application.port.secondary;

import com.acb.nwf.application.dto.EmployeeDto;
import com.acb.nwf.application.mapper.EmployeeMapper;
import com.acb.nwf.application.port.primary.IEmployeeApplicationService;
import com.acb.nwf.application.port.secondary.IBranchService;
import com.acb.nwf.application.port.secondary.IEmployeeRepository;
import com.acb.nwf.domain.entity.Employee;
import com.acb.nwf.domain.service.EmployeeDomainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeApplicationServiceImpl implements IEmployeeApplicationService {

    private final IEmployeeRepository employeeRepository;

    private final IBranchService branchService;

    private final EmployeeDomainService employeeDomainService;

    private final EmployeeMapper employeeMapper;

    @Override
    public void createNewEmployee(EmployeeDto employeeDto) {
        Employee employee = employeeMapper.dtoToEntity(employeeDto);
        Employee newEmployee = employeeDomainService.createNewEmployee(employee);
        employeeRepository.save(newEmployee);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        return employeeMapper.listEntityToListDto(employeeRepository.getAllEmployees());
    }
}
