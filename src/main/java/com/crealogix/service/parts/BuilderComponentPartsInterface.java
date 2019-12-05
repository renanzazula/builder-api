package com.crealogix.service.parts;

public interface BuilderComponentPartsInterface {

    String buildCheckBox(String fieldValue);

    String buildAmount(String label, String fieldValue);

    String buildTextField();

    String buildDate(String label, String fieldValue);

    String buildLastApproval();

    String buildHrefSummary(String label, String fieldValue, String path);

    String buildText(String label, String fieldValue);

    String buildComboBoxList();

    String buildSubRow();

    String buildThirtyRow();
    
    String addConfigurationTransactionWithoutRows();

    String addConfigurationTransactionWithRows(String fieldFileId, String fieldTotalRecords);
    
    String commonOperationViewConfirmResultSelect();
}
