package WeatherClient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.List;

    public class AccuweatherModel implements WeatherModel {
        //http://dataservice.accuweather.com/forecasts/v1/daily/1day/349727
        private static final String PROTOKOL = "https";
        private static final String BASE_HOST = "dataservice.accuweather.com";
        private static final String FORECASTS = "forecasts";
        private static final String VERSION = "v1";
        private static final String DAILY = "daily";
        private static final String ONE_DAY = "1day";
        private static final String FIVE_DAY = "5day";
        private static final String API_KEY = "erwp3yO5WPnZkcGo6kPa58BynS05yfaF";
        private static final String API_KEY_QUERY_PARAM = "apikey";
        private static final String LOCATIONS = "locations";
        private static final String CITIES = "cities";
        private static final String AUTOCOMPLETE = "autocomplete";

        private static final OkHttpClient okHttpClient = new OkHttpClient();
        private static final ObjectMapper objectMapper = new ObjectMapper();


        public void getWeather(String selectedCity, Period period) throws IOException {
            switch (period) {
                case NOW:
                    //http://dataservice.accuweather.com/forecasts/v1/daily/1day/
                    HttpUrl httpUrl = new HttpUrl.Builder()
                            .scheme(PROTOKOL)
                            .host(BASE_HOST)
                            .addPathSegment(FORECASTS)
                            .addPathSegment(VERSION)
                            .addPathSegment(DAILY)
                            .addPathSegment(ONE_DAY)
                            .addPathSegment(detectCityKey(selectedCity))
                            .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                            .build();

                    Request request = new Request.Builder()
                            .url(httpUrl)
                            .build();

                    Response oneDayForecastResponse = okHttpClient.newCall(request).execute();
                    String weatherResponse = oneDayForecastResponse.body().string();
                    //System.out.println(weatherResponse);
                    //TODO: сделать человекочитаемый вывод погоды. Выбрать параметры для вывода на свое усмотрение
                    showWeather(weatherResponse, selectedCity);
                    //Например: Погода в городе Москва - 5 градусов по цельсию Expect showers late Monday night
                    //dataBaseRepository.saveWeatherToDataBase(new Weather()) - тут после парсинга добавляем данные в БД
                    break;
                case FIVE_DAYS:
                    //TODO*: реализовать вывод погоды на 5 дней
                    //http://dataservice.accuweather.com/forecasts/v1/daily/5day/
                    HttpUrl httpUrl5days = new HttpUrl.Builder()
                            .scheme(PROTOKOL)
                            .host(BASE_HOST)
                            .addPathSegment(FORECASTS)
                            .addPathSegment(VERSION)
                            .addPathSegment(DAILY)
                            .addPathSegment(FIVE_DAY)
                            .addPathSegment(detectCityKey(selectedCity))
                            .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                            .build();

                    Request fiveDayrequest = new Request.Builder()
                            .url(httpUrl5days)
                            .build();

                    Response fiveDayForecastResponse = okHttpClient.newCall(fiveDayrequest).execute();
                    String fiveDayWeatherResponse = fiveDayForecastResponse.body().string();
                    //System.out.println(fiveDayWeatherResponse);
                    showWeather(fiveDayWeatherResponse, selectedCity);
                    break;
            }
        }


        private String detectCityKey(String selectCity) throws IOException {
            //http://dataservice.accuweather.com/locations/v1/cities/autocomplete
            HttpUrl httpUrl = new HttpUrl.Builder()
                    .scheme(PROTOKOL)
                    .host(BASE_HOST)
                    .addPathSegment(LOCATIONS)
                    .addPathSegment(VERSION)
                    .addPathSegment(CITIES)
                    .addPathSegment(AUTOCOMPLETE)
                    .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                    .addQueryParameter("q", selectCity)
                    .build();

            Request request = new Request.Builder()
                    .url(httpUrl)
                    .get()
                    .addHeader("accept", "application/json")
                    .build();

            Response response = okHttpClient.newCall(request).execute();
            String responseString = response.body().string();

            String cityKey = objectMapper.readTree(responseString).get(0).at("/Key").asText();
            return cityKey;
        }

        private void showWeather(String weatherString, String city) throws JsonProcessingException {

            String weather = objectMapper.readTree(weatherString).toPrettyString();
            System.out.println(weather);
        }
}
