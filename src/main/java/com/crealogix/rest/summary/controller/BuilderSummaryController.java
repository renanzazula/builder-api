package com.crealogix.rest.summary.controller;

import com.crealogix.rest.summary.dominio.SummaryRequest;
import com.crealogix.service.component.summary.BuildSummaryInterface;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuilderSummaryController implements BuilderSummaryInterface {
    
    private final BuildSummaryInterface buildSummaryInterface;

    public BuilderSummaryController(BuildSummaryInterface buildSummaryInterface) {
        this.buildSummaryInterface = buildSummaryInterface;
    }

    @Override
    public String createSummary(SummaryRequest summaryRequest) {
        return buildSummaryInterface.buildSummary(summaryRequest);
    }
}
