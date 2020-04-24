package com.ivan.garcia.cinepolistestapi.Connection;

import com.ivan.garcia.cinepolistestapi.models.Login;
import com.ivan.garcia.cinepolistestapi.utils.AppData;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface GetDataService {
    @POST(AppData.LOGIN_SERVICE)
    Call<Login> login(@Header("api_key") String apiKey, @Body RequestBody post);
}
