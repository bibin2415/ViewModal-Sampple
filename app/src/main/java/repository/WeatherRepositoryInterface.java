package repository;

import androidx.lifecycle.MutableLiveData;
import model.WeatherResponse;

public interface WeatherRepositoryInterface {
    MutableLiveData<WeatherResponse> getWeather(String locationName);
}
