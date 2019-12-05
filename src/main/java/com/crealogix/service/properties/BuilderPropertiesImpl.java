package com.crealogix.service.properties;

import com.crealogix.common.CommonConstant;
import com.crealogix.common.ComponentType;

public class BuilderPropertiesImpl implements BuilderPropertiesInterface {

    @Override
    public String buildProperties(String className, ComponentType componentType, String fieldsName) {

        String r = CommonConstant.QUOTE + componentType.toString().toLowerCase() + CommonConstant.DOT + className
                .toLowerCase() + CommonConstant.DOT + fieldsName.toLowerCase() + CommonConstant.QUOTE;
        
        return r;
    }
}
