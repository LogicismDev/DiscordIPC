package com.jagrosh.discordipc.entities;

public enum ActivityType {
    PLAYING,
    STREAMING,
    LISTENING,
    WATCHING,
    CUSTOM,
    COMPETING;

    public static ActivityType from(int index) {
        for (ActivityType value : values()) {
            if (value.ordinal() == index) {
                return value;
            }
        }

        return PLAYING;
    }
}
