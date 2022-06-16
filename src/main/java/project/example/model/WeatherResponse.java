package project.example.model;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
    private WeatherRequest request;
    private WeatherCurrent current;

    public WeatherCurrent getCurrent() {
        return current;
    }

    public void setCurrent(WeatherCurrent current) {
        this.current = current;
    }

    public WeatherRequest getRequest() {
        return request;
    }

    public void setRequest(WeatherRequest request) {
        this.request = request;
    }


  
    
}
