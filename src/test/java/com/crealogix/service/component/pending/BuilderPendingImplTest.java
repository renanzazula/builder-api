package com.crealogix.service.component.pending;

import com.crealogix.common.BuilderType;
import com.crealogix.rest.pending.dominio.PendingRequest;
import com.crealogix.service.constants.BuilderConstantsImpl;
import com.crealogix.service.constants.BuilderConstantsInterface;
import com.crealogix.service.dto.ClassAttributes;
import com.crealogix.service.dto.ControllerAttributes;
import com.crealogix.service.dto.FieldAttributes;
import com.crealogix.service.parts.BuilderComponentPartsImpl;
import com.crealogix.service.parts.BuilderComponentPartsInterface;
import com.crealogix.service.properties.BuilderPropertiesImpl;
import com.crealogix.service.properties.BuilderPropertiesInterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.annotation.security.RunAs;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class BuilderPendingImplTest {
    
    private List<FieldAttributes> fields = new ArrayList<>();
    private PendingRequest pendingRequest = null;
    
    @BeforeEach
    void setUp() {
        ClassAttributes classAttributes = new ClassAttributes();
        classAttributes.setCommandParameters("OmnibusRequest");
        classAttributes.setComponentName("OmnibusTxnComponent");
        classAttributes.setMenuFunction("TXN_XXXXXXXX_X");
        
        ControllerAttributes controllerAttributes  = new ControllerAttributes();
        controllerAttributes.setPath("/private/v1/xxxx/yyyy"); 
        
        FieldAttributes fieldAttributes = new FieldAttributes();
        fieldAttributes.setName("name");
        fieldAttributes.setBuilderType(BuilderType.STRING);
        fieldAttributes.setOrder(0);
        fields.add(fieldAttributes);
        
        fieldAttributes = new FieldAttributes();
        fieldAttributes.setName("date");
        fieldAttributes.setBuilderType(BuilderType.DATE);
        fieldAttributes.setOrder(1);
        fields.add(fieldAttributes);

        fieldAttributes = new FieldAttributes();
        fieldAttributes.setName("checkBox");
        fieldAttributes.setBuilderType(BuilderType.CHECKBOX);
        fieldAttributes.setOrder(2);
        fields.add(fieldAttributes);

        fieldAttributes = new FieldAttributes();
        fieldAttributes.setName("amount");
        fieldAttributes.setBuilderType(BuilderType.AMOUNT);
        fieldAttributes.setOrder(3);
        fields.add(fieldAttributes);

        fieldAttributes = new FieldAttributes();
        fieldAttributes.setName("href");
        fieldAttributes.setBuilderType(BuilderType.HREF);
        fieldAttributes.setOrder(4);
        fields.add(fieldAttributes);

        pendingRequest = new PendingRequest();        
        pendingRequest.setClassAttributes(classAttributes);
        pendingRequest.setControllerAttributes(controllerAttributes);
        pendingRequest.setFields(fields);
    }

    @Test
    void buildPending() {
        BuilderPropertiesInterface builderPropertiesInterface = new BuilderPropertiesImpl();
        BuilderConstantsInterface builderConstantsInterface = new BuilderConstantsImpl(builderPropertiesInterface);
        BuilderComponentPartsImpl builderComponentParts = new BuilderComponentPartsImpl(builderConstantsInterface, builderPropertiesInterface);
        BuildPendingImpl buildPending = new BuildPendingImpl(builderComponentParts, builderConstantsInterface);
        System.out.println(buildPending.buildPending(pendingRequest));
    }
}
