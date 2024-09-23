package net.devex.one.domain.domainservice;
import com.acb.nwf.domain.entity.Employee;
import com.acb.nwf.domain.entity.Project;
import com.acb.nwf.domain.valueobject.ProjectId;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeDomainService {

    public Employee createNewEmployee(Employee employee) {

        final Project project = new Project(new ProjectId(456L), "NWF");
        project.doSomething();

        employee.doSomething(project);

        //TODO: a logic requires at least 02 entities involved, then put that herein domain service
        // or, any logic that does not make any sense while putting in the Entity Root or Aggregation Root

        return employee;
    }

}
