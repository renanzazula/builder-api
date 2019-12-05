package com.crealogix.common;

public class CommonConstant {

    public static final String BREAK_LINE = " \n";
    public static final String OVERRIDE = "@Override" + BREAK_LINE;

    public static final String PUBLIC_STATIC_FINAL_STRING = " public static final String ";

    public static final String PENDING_METHOD_DECLARATION =
            "public ReportData buildCustomReportTransactions(AbstractTransaction authFlowTransaction, PendingAuthorizationParameters<AbstractTransaction> parameter) {"
                    + BREAK_LINE;
    public static final String PENDING_METHOD_RETURN_CLOSE = "return reportDataBuilder.getReportData(); }" + BREAK_LINE;

    public static final String REPORT_DATA_BUILDER_DECLARATION ="ReportDataBuilder reportDataBuilder = generateReportDataBuilder();" + BREAK_LINE;
    public static final String REPORT_DATA_BUILDER_SETTER ="parameter.setReportDataBuilder(reportDataBuilder);" + BREAK_LINE;

    public static final String BUILD_TEXT = "reportDataBuilder.addLabelStringValue";
    public static final String BUILD_DATE = "reportDataBuilder.addLabelDateValue";
    public static final String BUILD_CHECK_BOX = "reportDataBuilder.addLabelCheckboxValue";
    public static final String BUILD_AMOUNT = "reportDataBuilder.addLabelAmountValue";
    public static final String BUILD_HREF_SUMMARY_LINK = "reportDataBuilder.addLabelHrefValue";

    public static final String BUILD_ADD_CONFIGURATION_TRANSACTION              = "reportDataBuilder.addConfigurationTransactionLabelValue";
    public static final String BUILD_ADD_CONFIGURATION_TRANSACTION_WITHOUT_ROWS = "(addConfigurationTransactionWithoutRows(authFlowTransaction, parameter.getView()));" + BREAK_LINE;
    public static final String BUILD_ADD_CONFIGURATION_TRANSACTION_WITH_ROWS    = "(addConfigurationTransactionWithoutRows(authFlowTransaction, %s, %s, parameter.getView()));" + BREAK_LINE;
    public static final String COMMON_OPERATION_VIEW_CONFIRM_RESULT_SELECT      = "commonOperationViewConfirmResultSelect(authFlowTransaction, parameter, reportDataBuilder);" + BREAK_LINE;

    public static final String SEMI_COLON = ";";
    public static final String EQUAL = "=";
    public static final String QUOTE = "\"";
    public static final String DOT = ".";
    public static final String COMMA = ",";
    public static final String UNDERSCORE = "_";
    public static final String OPEN_PARENTHESIS = "(";
    public static final String CLOSE_PARENTHESIS = ")";
    public static final String NULL_VALUE = "null";

    public static String FINAL_BUILD_TEXT =
            BUILD_TEXT + OPEN_PARENTHESIS + "%s" + COMMA + "%s" + CLOSE_PARENTHESIS + SEMI_COLON + BREAK_LINE;

    public static String FINAL_BUILD_CHECK_BOX =
            BUILD_CHECK_BOX + OPEN_PARENTHESIS + NULL_VALUE + COMMA + "%s" + CLOSE_PARENTHESIS + SEMI_COLON
                    + BREAK_LINE;

    public static String FINAL_BUILD_DATE =
            BUILD_DATE + OPEN_PARENTHESIS + "%s" + COMMA + "%s" + CLOSE_PARENTHESIS + SEMI_COLON + BREAK_LINE;

    public static String FINAL_BUILD_AMOUNT =
            BUILD_AMOUNT + OPEN_PARENTHESIS + "%s" + COMMA + "%s" + CLOSE_PARENTHESIS + SEMI_COLON + BREAK_LINE;

    public static String FINAL_BUILD_HREF_SUMMARY_LINK =
            BUILD_HREF_SUMMARY_LINK + OPEN_PARENTHESIS + "%s" + COMMA + "%s" + COMMA + "\"%s\"" + CLOSE_PARENTHESIS
                    + SEMI_COLON + BREAK_LINE;

    public static String FINAL_BUILD_ADD_CONFIGURATION_TRANSACTION_WITHOUT_ROWS =
            BUILD_ADD_CONFIGURATION_TRANSACTION + BUILD_ADD_CONFIGURATION_TRANSACTION_WITHOUT_ROWS;

    public static String FINAL_BUILD_ADD_CONFIGURATION_TRANSACTION_WITH_ROWS =
            BUILD_ADD_CONFIGURATION_TRANSACTION + BUILD_ADD_CONFIGURATION_TRANSACTION_WITH_ROWS;

}
