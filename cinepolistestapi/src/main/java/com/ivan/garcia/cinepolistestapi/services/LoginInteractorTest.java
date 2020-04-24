package com.ivan.garcia.cinepolistestapi.services;

import com.ivan.garcia.cinepolistestapi.Connection.GetDataService;
import com.ivan.garcia.cinepolistestapi.Connection.RetrofitInstance;
import com.ivan.garcia.cinepolistestapi.listeners.OnFinishedListener;
import com.ivan.garcia.cinepolistestapi.models.Login;
import com.ivan.garcia.cinepolistestapi.utils.AppData;
import com.ivan.garcia.cinepolistestapi.utils.ErrorUtil;

import java.net.HttpURLConnection;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginInteractorTest {
    public void doLogin(final OnFinishedListener onFinishedListener, String postData) {
        RequestBody body = RequestBody.create(okhttp3.MediaType.parse("text/plain"), postData);

        GetDataService service = RetrofitInstance.getRetrofitInstance().create(GetDataService.class);
        Call<Login> call = service.login(AppData.API_KEY, body);

        call.enqueue(new Callback<Login>() {
            @Override
            public void onResponse(Call<Login> call, Response<Login> response) {
                if (response.code() == HttpURLConnection.HTTP_OK)
                    onFinishedListener.onFinished(response.body());
                else
                    onFinishedListener.onErrorResponse(ErrorUtil.parseError(response));
            }

            @Override
            public void onFailure(Call<Login> call, Throwable t) {
                onFinishedListener.onFailure(t);
            }
        });
    }
}
