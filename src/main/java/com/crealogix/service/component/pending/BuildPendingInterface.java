package com.crealogix.service.component.pending;

import com.crealogix.rest.pending.dominio.PendingRequest;

public interface BuildPendingInterface {
    
    String buildPending(PendingRequest pendingRequest);
    
}
