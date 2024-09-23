package net.devex.one.infrastructure.persistence;

import com.acb.nwf.application.port.secondary.IEmployeeRepository;
import com.acb.nwf.domain.entity.Employee;
import com.acb.nwf.infrastructure.mapper.EmployeeMapper;
import com.acb.nwf.infrastructure.out.persistance.jpa.EmployeeJpa;
import com.acb.nwf.infrastructure.out.persistance.jpa.EmployeeJpaRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class EmployeeRepositoryImpl implements IEmployeeRepository {

    private final EmployeeJpaRepository employeeJpaRepository;

    private final EmployeeMapper employeeMapper;

    @Override
    public void save(Employee employee) {
        EmployeeJpa employeeJpa = employeeMapper.entityToJpa(employee);
        employeeJpaRepository.save(employeeJpa);
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<EmployeeJpa> employeeJpaList = employeeJpaRepository.findAll();
        return employeeMapper.jpaListToEntityList(employeeJpaList);
    }
}
