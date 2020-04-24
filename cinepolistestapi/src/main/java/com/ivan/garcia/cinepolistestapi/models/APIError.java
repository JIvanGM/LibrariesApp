package com.ivan.garcia.cinepolistestapi.models;

public class APIError {

    private int error;
    private String error_description;

    public APIError() {
    }

    public APIError(int errorCode, String errorDescription) {
        this.error = errorCode;
        this.error_description = errorDescription;
    }

    public int getStatus() {
        return error;
    }

    public String getErrordescription() {
        return error_description;
    }
}