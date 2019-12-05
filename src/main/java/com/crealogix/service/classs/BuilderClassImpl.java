package com.crealogix.service.classs;

import com.crealogix.rest.pending.dominio.PendingRequest;
import com.crealogix.service.component.pending.BuildPendingInterface;
import org.springframework.stereotype.Component;

@Component
public class BuilderClassImpl implements BuilderClassInterface {
    
    private BuildPendingInterface buildPendingInterface;

    public BuilderClassImpl(BuildPendingInterface buildPendingInterface) {
        this.buildPendingInterface = buildPendingInterface;
    }

    @Override
    public String buildClass(PendingRequest pendingRequest) {
        buildPendingInterface.buildPending(pendingRequest);
        return null;
    }
}
