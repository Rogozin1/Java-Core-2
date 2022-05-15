package lesson7.homeWork;

import lesson7.homeWork.enums.Periods;

import java.io.IOException;

public interface WeatherProvider {

    public void getWeather(Periods period) throws IOException;
}
