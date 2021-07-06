package com.shell.viewmodalsample;

import android.content.Context;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import model.Weather;
import model.WeatherResponse;
import repository.WeatherRepositoryInterface;

public class WeatherViewModal extends ViewModel {

    private MutableLiveData<Weather> mWeatherData;
    private WeatherRepositoryInterface mRepository;
    private Context mContext;

    public WeatherViewModal(WeatherRepositoryInterface repository, Context context) {
        mRepository = repository;
        mContext = context;
    }

    public LiveData<Weather> getWeatherData() {
        return mWeatherData;
    }

    public void callWeatherData(String name) {
        mRepository.getWeather(name).observe((LifecycleOwner) this, new Observer<WeatherResponse>() {
            @Override
            public void onChanged(WeatherResponse weatherResponse) {
                mWeatherData.setValue(weatherResponse.getWeather().get(0));
            }
        });
    }
}
