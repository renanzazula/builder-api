package com.crealogix.rest.pending.controller;

import com.crealogix.rest.pending.dominio.PendingRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(value ="builder/pending", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
public interface BuilderPendingInterface {
    
    @PostMapping
    String createPending(PendingRequest pendingRequest);
    
}
