//retreive weather data from API-this backend logic will fetch the lastest weather
//data from the external API and return it. the GUI will
//display this data to user
public class WeatherApp{
    //feth ewather data for given location
    public static JSONObject getWeatherData(String locationName) {
        //get loaction coordinates using the geolocation API
        JSONArray loactionData = get loactionData(locationName);
    }

    private static JSONArray getLocationData(String locationName){
        //replace any whitespace in location name to + to adhere to API's request format
    }
}
