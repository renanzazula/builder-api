package com.crealogix.service.constants;

import com.crealogix.common.ComponentType;

public interface BuilderConstantsInterface {

    String buildConstant(String className, ComponentType componentType, String fieldsName);
    String buildConstantPlusProperties(String className, ComponentType componentType, String fieldsName);
    

}
