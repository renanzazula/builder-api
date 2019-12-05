package com.crealogix.service.component.pending;

import com.crealogix.common.CommonConstant;
import com.crealogix.common.ComponentType;
import com.crealogix.rest.pending.dominio.PendingRequest;
import com.crealogix.service.constants.BuilderConstantsInterface;
import com.crealogix.service.dto.FieldAttributes;
import com.crealogix.service.parts.BuilderComponentPartsInterface;
import org.springframework.stereotype.Component;

@Component
public class BuildPendingImpl implements BuildPendingInterface {

    private final BuilderComponentPartsInterface builderComponentPartsInterface;
    private final BuilderConstantsInterface builderConstantsInterface;

    public BuildPendingImpl(BuilderComponentPartsInterface builderComponentPartsInterface,
            BuilderConstantsInterface builderConstantsInterface) {
        this.builderComponentPartsInterface = builderComponentPartsInterface;
        this.builderConstantsInterface = builderConstantsInterface;
    }

    @Override
    public String buildPending(PendingRequest pendingRequest) {
        StringBuilder pendingFields = new StringBuilder();
        
        pendingFields.append(CommonConstant.OVERRIDE);
        pendingFields.append(CommonConstant.PENDING_METHOD_DECLARATION);
        pendingFields.append(CommonConstant.REPORT_DATA_BUILDER_DECLARATION);
        pendingFields.append(CommonConstant.REPORT_DATA_BUILDER_SETTER);
        
        for (FieldAttributes field : pendingRequest.getFields()) {
            String componentName = pendingRequest.getClassAttributes().getComponentName();
            String label = builderConstantsInterface.buildConstant(componentName, ComponentType.PENDING, field.getName());
            String fieldName = field.getName();
            switch (field.getBuilderType()) {
                case STRING:
                    pendingFields.append(builderComponentPartsInterface.buildText(label, fieldName));
                    break;
                case DATE:
                    pendingFields.append(builderComponentPartsInterface.buildDate(label, fieldName));
                    break;
                case HREF:
                    String path = pendingRequest.getControllerAttributes().getPath();
                    pendingFields.append(builderComponentPartsInterface.buildHrefSummary(label, fieldName, path));
                    break;
                case AMOUNT:
                    pendingFields.append(builderComponentPartsInterface.buildAmount(label, fieldName));
                    break;
                case CHECKBOX:
                    pendingFields.append(builderComponentPartsInterface.buildCheckBox(fieldName));
                    break;
                default: {
                    // todo: 
                }
            }
        }
        
        pendingFields.append(builderComponentPartsInterface.addConfigurationTransactionWithoutRows());
        pendingFields.append(builderComponentPartsInterface.commonOperationViewConfirmResultSelect());
        pendingFields.append(CommonConstant.PENDING_METHOD_RETURN_CLOSE);
        
        return pendingFields.toString();
    }

}
