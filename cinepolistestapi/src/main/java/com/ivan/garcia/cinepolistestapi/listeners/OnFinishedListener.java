package com.ivan.garcia.cinepolistestapi.listeners;

import com.ivan.garcia.cinepolistestapi.models.APIError;
import com.ivan.garcia.cinepolistestapi.models.Login;

public interface OnFinishedListener {
    void onFinished(Login login);

    void onFailure(Throwable t);

    void onErrorResponse(APIError apiError);
}
