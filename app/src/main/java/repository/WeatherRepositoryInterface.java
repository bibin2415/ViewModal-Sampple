package repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import model.WeatherResponse;

public interface WeatherRepositoryInterface {
    LiveData<WeatherResponse> getWeather(String locationName);
}
