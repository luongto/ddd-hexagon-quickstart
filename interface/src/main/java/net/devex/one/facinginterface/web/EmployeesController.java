package net.devex.one.facinginterface.web;

import com.acb.nwf.application.dto.EmployeeDto;
import com.acb.nwf.application.port.primary.IEmployeeApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.acb.nwf.common.constants.CommonConstants.SUCCESS_MSG;
import static com.acb.nwf.infrastructure.in.web.ApiMapping.V1_EMPLOYEES;

@RestController
@RequiredArgsConstructor
@RequestMapping(V1_EMPLOYEES)
public class EmployeesController {

    private final IEmployeeApplicationService employeeApplicationService;

    @PostMapping
    public ResponseEntity<Object> addNewEmployee(@RequestBody final EmployeeDto employeeRqDto) {
        employeeApplicationService.createNewEmployee(employeeRqDto);
        return new ResponseEntity<>(SUCCESS_MSG, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Object> getAllEmployees() {
        return ResponseEntity.ok(employeeApplicationService.getAllEmployees());
    }
}
