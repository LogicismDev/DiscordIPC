package com.jagrosh.discordipc.entities;

public enum PartyPrivacy {
    PRIVATE,
    PUBLIC;

    public static PartyPrivacy from(int index) {
        for (PartyPrivacy value : values()) {
            if (value.ordinal() == index) {
                return value;
            }
        }

        return PUBLIC;
    }
}
