package com.ivan.garcia.cinepolistestapi.utils;

public class AppData {
    public static final String BASE_URL = "https://stage-api.cinepolis.com/";
    public static final String API_KEY = "stage_X877qRfm57QLpF_android";

    public static final String LOGIN_SERVICE = "v2/oauth/token";

    public static final String PROFILE_SERVICE = "v1/members/profile?country_code=MX";

    public static final String LOYALTY_SERVICE = "v2/members/loyalty/";

    public static final String CARTELERA_SERVICE = "v2/movies?country_code=MX&cinemas=32";

    public static final String COMPLEJO_SERVICE = "v2/locations/cinemas/69?country_code=MX";

    public static final String LOGIN_POST = "country_code=MX&username=%s&password=%s&grant_type=password&client_id=IATestCandidate&client_secret=c840457e777b4fee9b510fbcd4985b68";

    public static final String AUTHORIZATION_HEADER = "%s %s";

    public static final String COUNTRY_CODE = "MX";

    public static final String LOCALE_CODE = "es";

    public static final String PIN_TEST = "1592";

    public static final boolean TRANSACTIONS_INCLUDE = true;

    public static final String CONTENT_TYPE_JSON = "application/json; charset=utf-8";

    public static final String CARD_NUMBER_KEY = "card_number";
    public static final String COUNTRY_KEY = "country_code";
    public static final String PIN_KEY = "pin";
    public static final String TRANSACTION_KEY = "transaction_include";
}