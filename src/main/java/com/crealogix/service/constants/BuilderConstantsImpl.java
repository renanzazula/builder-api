package com.crealogix.service.constants;

import com.crealogix.common.CommonConstant;
import com.crealogix.common.ComponentType;
import com.crealogix.service.properties.BuilderPropertiesInterface;
import org.springframework.stereotype.Component;

@Component
public class BuilderConstantsImpl implements BuilderConstantsInterface {

    private final BuilderPropertiesInterface builderPropertiesInterface;

    public BuilderConstantsImpl(BuilderPropertiesInterface builderPropertiesInterface) {
        this.builderPropertiesInterface = builderPropertiesInterface;
    }

    @Override
    public String buildConstant(String className, ComponentType componentType, String fieldsName) {
        String constantName = className + CommonConstant.UNDERSCORE + fieldsName;
        return constantName.toUpperCase();
    }

    @Override
    public String buildConstantPlusProperties(String className, ComponentType componentType, String fieldsName) {
        String propertiesValue = builderPropertiesInterface.buildProperties(className, componentType, fieldsName);
        String constantName = className + CommonConstant.UNDERSCORE + fieldsName;
        String finalConstant =
                CommonConstant.PUBLIC_STATIC_FINAL_STRING + " " + constantName.toUpperCase() + CommonConstant.EQUAL
                        + propertiesValue.toUpperCase() + CommonConstant.SEMI_COLON;
        return finalConstant;
    }
}
