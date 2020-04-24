package com.ivan.garcia.cinepolistestapi.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ivan.garcia.cinepolistestapi.models.APIError;

import java.lang.reflect.Type;

import retrofit2.Response;

public class ErrorUtil {

    public static APIError parseError(Response<?> response) {
        try {
            Gson gson = new Gson();
            Type type = new TypeToken<APIError>() {}.getType();
            return gson.fromJson(response.errorBody().string(), type);
        } catch (Exception e) {
            return null;
        }
    }
}