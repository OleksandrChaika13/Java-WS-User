package org.example.server;

public enum Gender {

    MALE, FEMALE;

    public String value() {
        return name();
    }

    public static Gender fromValue(String v) {
        return valueOf(v);
    }
}