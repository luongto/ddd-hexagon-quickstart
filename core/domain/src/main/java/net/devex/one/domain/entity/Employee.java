package net.devex.one.domain.entity;

import com.acb.nwf.common.constants.Department;
import com.acb.nwf.common.entity.BaseEntity;
import com.acb.nwf.domain.valueobject.EmployeeId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public final class Employee extends BaseEntity<EmployeeId> {

    private final EmployeeId id;

    private final String name;

    private final String title;

    private final Department department;

    private final Project project;

    public void doSomething(Project project) {
        //TODO: business logic of the entity Employee itself
    }
}
