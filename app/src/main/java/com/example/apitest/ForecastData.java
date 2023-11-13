package com.example.apitest;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ForecastData {

    @SerializedName("list")
    ArrayList<Forecast> previsions;
    @SerializedName("city")
    City city;

    public ArrayList<Forecast> getPrevisions() {
        return previsions;
    }
}
