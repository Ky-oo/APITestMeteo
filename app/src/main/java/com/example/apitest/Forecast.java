package com.example.apitest;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Forecast implements Serializable {

    @SerializedName("main")
    Weather weather;

    @SerializedName("dt")
    private int datetime;

    public Weather getWeather() {
        return weather;
    }

    public int getDatetime() {
        return datetime;
    }
}
