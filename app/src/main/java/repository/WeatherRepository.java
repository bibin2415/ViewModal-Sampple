package repository;

import androidx.lifecycle.MutableLiveData;
import model.WeatherResponse;
import remote.RetrofitCall;
import remote.WeatherService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WeatherRepository implements WeatherRepositoryInterface {
    private MutableLiveData<WeatherResponse> mWeatherResponseMutableLiveData;
    private static WeatherService mService;
    public static WeatherRepository mRepository;

    private WeatherRepository() {
    }

    public static WeatherRepository WeatherRepository(WeatherService service) {
        if (mRepository == null) {
            mRepository = new WeatherRepository();
            mService = RetrofitCall.getRetrofit().create(WeatherService.class);
        }
        return mRepository;
    }

    @Override
    public MutableLiveData<WeatherResponse> getWeather(String locationName) {
        mService.getWeather().enqueue(new Callback<WeatherResponse>() {
            @Override
            public void onResponse(Call<WeatherResponse> call, Response<WeatherResponse> response) {

            }

            @Override
            public void onFailure(Call<WeatherResponse> call, Throwable t) {

            }
        });
        return mWeatherResponseMutableLiveData;
    }
}
