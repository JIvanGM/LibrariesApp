package com.ivan.garcia.cinepolistestapi.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Login {

    @SerializedName("access_token")
    @Expose
    public String accessToken;
    @SerializedName("token_type")
    @Expose
    public String tokenType;
    @SerializedName("expires_in")
    @Expose
    public int expiresIn;
    @SerializedName("refresh_token")
    @Expose
    public String refreshToken;
    @SerializedName("as:client_id")
    @Expose
    public String asClientId;
    @SerializedName("username")
    @Expose
    public String username;
    @SerializedName("country_code")
    @Expose
    public String countryCode;
    @SerializedName(".issued")
    @Expose
    public String issued;
    @SerializedName(".expires")
    @Expose
    public String expires;

}