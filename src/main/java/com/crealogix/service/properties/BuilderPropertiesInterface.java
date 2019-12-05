package com.crealogix.service.properties;

import com.crealogix.common.ComponentType;

public interface BuilderPropertiesInterface {
    
    String buildProperties(String className, ComponentType  componentType, String fieldsName);
       
}
