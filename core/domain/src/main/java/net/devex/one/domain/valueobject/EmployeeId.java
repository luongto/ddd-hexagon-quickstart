package net.devex.one.domain.valueobject;

import com.acb.nwf.common.valueobject.BaseId;
import lombok.Getter;

@Getter
public class EmployeeId extends BaseId<Long> {

    public EmployeeId(Long value) {
        super(value);
    }

}
