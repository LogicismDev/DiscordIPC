package com.jagrosh.discordipc.entities;

public enum DisplayType {
    NAME,
    STATE,
    DETAILS;

    public static DisplayType from(int index) {
        for (DisplayType value : values()) {
            if (value.ordinal() == index) {
                return value;
            }
        }

        return NAME;
    }
}
