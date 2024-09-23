package net.devex.one.application.mapper;

import com.acb.nwf.application.dto.EmployeeDto;
import com.acb.nwf.domain.entity.Employee;
import com.acb.nwf.domain.valueobject.EmployeeId;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeInboundMapper {

    @Mapping(source = "id", target = "id.value")
    Employee dtoToEntity(EmployeeDto employeeDto);

    EmployeeDto entityToDto(Entity employee);

    List<EmployeeDto> listEntityToListDto( List<Employee> employeeEntities);

    default Long mapId(EmployeeId value) {
        return value != null ? value.getValue() : null;
    }
}
