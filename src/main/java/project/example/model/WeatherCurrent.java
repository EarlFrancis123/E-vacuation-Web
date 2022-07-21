package project.example.model;




import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherCurrent {
    private String observation_time;
    private String temperature;
    private String weather_code;
    private String humidity;
    private String wind_speed;

   
    public String getObservation_time() {
        return observation_time;
    }
    public void setObservation_time(String observation_time) {
        this.observation_time = observation_time;
    }
    public String getTemperature() {
        return temperature;
    }
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
    public String getWeather_code() {
        return weather_code;
    }
    public void setWeather_code(String weather_code) {
        this.weather_code = weather_code;
    }
    public String getHumidity() {
        return humidity;
    }
    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
    public String getWind_speed() {
        return wind_speed;
    }
    public void setWind_speed(String wind_speed) {
        this.wind_speed = wind_speed;
    }
 
 
  
    
  

    
    
    
}
