package com.crealogix.rest.summary.controller;

import com.crealogix.rest.summary.dominio.SummaryRequest;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(value ="builder/summary", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
public interface BuilderSummaryInterface {

    String createSummary(SummaryRequest summaryRequest);
    
}
