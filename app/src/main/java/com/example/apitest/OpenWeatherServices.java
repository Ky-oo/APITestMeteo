package com.example.apitest;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OpenWeatherServices {
    @GET("forecast")
    Call<ForecastData> getForcastWithLocation(@Query("q") String ville, @Query("appid") String apiKey, @Query("units") String units);

}