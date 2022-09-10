package project.example.action;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


import project.example.model.WeatherResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Weather {
    WeatherResponse weatherResponse;
    private String searchKeyword;

    public String execute() throws Exception {
       
        
        try {
            URL url = new URL("http://api.weatherstack.com/current?access_key=9de53c99ecaac9db053740651603d9cc&query="+searchKeyword);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            if(conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed :  HTTP error code : " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output;
            while((output = br.readLine()) != null) {
                ObjectMapper mapper = new ObjectMapper();
                weatherResponse = mapper.readValue(output, WeatherResponse.class);
            }
            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "success";
    }
    public WeatherResponse getWeatherResponse() {
        return weatherResponse;
    }
    public void setWeatherResponse(WeatherResponse weatherResponse) {
        this.weatherResponse = weatherResponse;
    }
    public String getSearchKeyword() {
        return searchKeyword;
    }
    public void setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
    }


   


}
