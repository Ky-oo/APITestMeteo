package com.example.apitest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import java.util.Random;

import com.example.apitest.databinding.ActivityMainBinding;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ForecastData weatherData;
    private ArrayList<Forecast> allWeather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        Habit habit = new Habit();
        View view = binding.getRoot();
        setContentView(view);

        OpenWeatherServices service =
                RetrofitClientInstance.getRetrofitInstance().create(OpenWeatherServices.
                        class);
        String villeSelecter =  "Annecy";
        String apiKey = "f18da5eb37b684aaa6386672c6ffcd02";
        String units = "metric";
        Call<ForecastData> newCall = service.getForcastWithLocation(villeSelecter, apiKey, units);
        newCall.enqueue(new Callback<ForecastData>() {
            @Override
            public void onResponse(Call<ForecastData> call, Response<ForecastData>
                    response) {
                weatherData = response.body();

                updateUI(weatherData);

                Double temperatureActuel = weatherData.getPrevisions().get(0).getWeather().getTemp();


                habit.habitEnFonctionTemperature(temperatureActuel);
                affichageTenu(habit.getChaussure(), habit.getPantalon(), habit.getPull(), habit.getShortCourt(), habit.getTshirt(), habit.getVeste());




                binding.buttonValiderVille.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String villeSelecter = binding.editTextVilleInput.getText().toString();

                        String apiKey = "f18da5eb37b684aaa6386672c6ffcd02";
                        String units = "metric";

                        // Créez une nouvelle requête avec la nouvelle localisation
                        Call<ForecastData> newCall = service.getForcastWithLocation(villeSelecter, apiKey, units);
                        newCall.enqueue(new Callback<ForecastData>() {
                            @Override
                            public void onResponse(Call<ForecastData> call, Response<ForecastData> response) {
                                weatherData = response.body();
                                updateUI(weatherData);
                                Toast.makeText(MainActivity.this, "Météo mise à jour", Toast.LENGTH_SHORT).show();
                                binding.editTextVilleInput.setText("");
                                Double temperatureActuel = weatherData.getPrevisions().get(0).getWeather().getTemp();
                                habit.habitEnFonctionTemperature(temperatureActuel);
                                affichageTenu(habit.getChaussure(), habit.getPantalon(), habit.getPull(), habit.getShortCourt(), habit.getTshirt(), habit.getVeste());

                            }

                            @Override
                            public void onFailure(Call<ForecastData> call, Throwable t) {
                                Toast.makeText(MainActivity.this, "Une erreur est survenue !", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                });

            }
            @Override
            public void onFailure(Call<ForecastData> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Une erreur est survenue !",
                        Toast.LENGTH_SHORT).show();
            }

            private void updateUI(ForecastData weatherData) {
                double temperatureActuel = weatherData.getPrevisions().get(0).getWeather().getTemp();
                binding.textViewTemperature.setText(String.valueOf(temperatureActuel));
                binding.textViewVille.setText(weatherData.city.getCityName());
            }

            public void affichageTenu(String chaussure, String pantalon, String pull, String shortCourt, String tshirt, String veste) {

                    binding.textViewChaussure.setText(chaussure);
                    binding.textViewPantalon.setText(pantalon);
                    binding.textViewPull.setText(pull);
                    binding.textViewShort.setText(shortCourt);
                    binding.textViewTshirt.setText(tshirt);
                    binding.textViewVeste.setText(veste);
            }

        });

    }

}

