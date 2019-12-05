package com.crealogix.rest.pending.controller;

import com.crealogix.rest.pending.dominio.PendingRequest;
import com.crealogix.service.component.pending.BuildPendingInterface;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuilderPendingController implements com.crealogix.rest.pending.controller.BuilderPendingInterface {

    private BuildPendingInterface buildPendingInterface;

    public BuilderPendingController(BuildPendingInterface buildPendingInterface) {
        this.buildPendingInterface = buildPendingInterface;
    }

    @Override
    public String createPending(PendingRequest pendingRequest) {
        return buildPendingInterface.buildPending(pendingRequest);
    }
}
