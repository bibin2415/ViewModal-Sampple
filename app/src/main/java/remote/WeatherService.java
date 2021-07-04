package remote;

import java.util.List;

import model.WeatherResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface WeatherService {
    @GET("weather")
    Call<WeatherResponse> getWeather();
}
