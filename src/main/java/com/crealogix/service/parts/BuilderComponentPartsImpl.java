package com.crealogix.service.parts;

import com.crealogix.common.CommonConstant;
import com.crealogix.common.ComponentType;
import com.crealogix.service.constants.BuilderConstantsInterface;
import com.crealogix.service.properties.BuilderPropertiesInterface;
import org.springframework.stereotype.Component;

@Component
public class BuilderComponentPartsImpl implements BuilderComponentPartsInterface {

    private final BuilderConstantsInterface builderConstantsInterface;
    private final BuilderPropertiesInterface builderPropertiesInterface;

    public BuilderComponentPartsImpl(BuilderConstantsInterface builderConstantsInterface,
            BuilderPropertiesInterface builderPropertiesInterface) {
        this.builderConstantsInterface = builderConstantsInterface;
        this.builderPropertiesInterface = builderPropertiesInterface;
    }

    @Override
    public String buildCheckBox(String fieldValue) {
        return String.format(CommonConstant.FINAL_BUILD_CHECK_BOX, fieldValue);
    }

    @Override
    public String buildAmount(String label, String fieldValue) {
        return String.format(CommonConstant.FINAL_BUILD_AMOUNT, label, fieldValue);
    }

    @Override
    public String buildTextField() {
        return null;
    }

    @Override
    public String buildDate(String label, String fieldValue) {
        return String.format(CommonConstant.FINAL_BUILD_DATE, label, fieldValue);
    }

    @Override
    public String buildLastApproval() {
        return null;
    }

    @Override
    public String buildHrefSummary(String label, String fieldValue, String path) {
        return String.format(CommonConstant.FINAL_BUILD_HREF_SUMMARY_LINK, label, fieldValue, path);
    }

    @Override
    public String buildText(String label, String fieldValue) {
        return String.format(CommonConstant.FINAL_BUILD_TEXT, label, fieldValue);
    }

    @Override
    public String buildComboBoxList() {
        return null;
    }

    @Override
    public String buildSubRow() {
        return null;
    }

    @Override
    public String buildThirtyRow() {
        return null;
    }

    @Override
    public String addConfigurationTransactionWithoutRows() {
        return CommonConstant.FINAL_BUILD_ADD_CONFIGURATION_TRANSACTION_WITHOUT_ROWS;
    }

    @Override
    public String addConfigurationTransactionWithRows(String fieldFileId, String fieldTotalRecords) {
        return String.format(CommonConstant.FINAL_BUILD_ADD_CONFIGURATION_TRANSACTION_WITH_ROWS, fieldFileId,
                fieldTotalRecords);
    }

    @Override
    public String commonOperationViewConfirmResultSelect() {
        return CommonConstant.COMMON_OPERATION_VIEW_CONFIRM_RESULT_SELECT;
    }
}
