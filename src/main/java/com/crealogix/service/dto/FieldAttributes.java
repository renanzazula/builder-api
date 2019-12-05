package com.crealogix.service.dto;

import com.crealogix.common.BuilderType;
import lombok.Data;

@Data
public class FieldAttributes {
    
    private int order;
    private String name;
    private BuilderType builderType;
    
    // add field from screen ... 
}
