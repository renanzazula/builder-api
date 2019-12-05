package com.crealogix.common;

public enum ActionType {

    SUMMARY(), DOWNLOAD(), REJECT(), APPROVE(), REMOVE(), EJECT(), DETAILS();

    private String value;

    ActionType(String value) {
        this.value = value;
    }

    ActionType() {

    }

    public String getValue() {
        return value;
    }

}
