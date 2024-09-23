package net.devex.one.domain.entity;

import com.acb.nwf.common.entity.BaseEntity;
import com.acb.nwf.domain.valueobject.ProjectId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Project extends BaseEntity<ProjectId> {
    private final ProjectId ProjectId;
    private final String ProjectName;

    public void doSomething(){
        //TODO: business logic of the entity Project itself
    }
}
