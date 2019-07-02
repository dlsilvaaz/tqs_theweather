package tqs.hw.TheWeather;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

public class Cache {
	
	@Autowired
    CommandLineRunner run;
	
	private static RestTemplate restTemplate = new RestTemplate();
	protected static Map<String,Forecast> forecasts = new HashMap<>();
	protected static Map<String,Integer> locations = new HashMap<>();
	protected static long lastUpdateTime = System.currentTimeMillis() / 1000L - 901;
	
	public static void setup() {
		LocationsCollection collection = restTemplate.getForObject("http://api.ipma.pt/open-data/distrits-islands.json", LocationsCollection.class);
		Location[] locationsArr = collection.getData();
		for(Location l : locationsArr){
			String location = l.getLocal();
			int id = l.getGlobalIdLocal();
			try {
				restTemplate.getForObject("http://api.ipma.pt/open-data/forecast/meteorology/cities/daily/" + id + ".json", Forecast.class);
				locations.put(location, id);
			}
			catch(HttpClientErrorException e) {
				continue;
			}
			locations.put(location, id);
		}
		fetch();
	}
	
	public static void fetch() {
		for(String l : locations.keySet()) {
			try {
				Forecast forecast = restTemplate.getForObject("http://api.ipma.pt/open-data/forecast/meteorology/cities/daily/" + locations.get(l) + ".json", Forecast.class);
				forecasts.put(l, forecast);
			}
			catch(HttpClientErrorException e) {
				continue;
			}
		}
		lastUpdateTime = System.currentTimeMillis() / 1000L;
	}
	
	public static Forecast getForecast(String name) {
		if((System.currentTimeMillis() / 1000L) - lastUpdateTime > 600) {
			fetch();
		}
		return forecasts.get(name);
	}
	
	public static Set<String> getLocations() {
		return locations.keySet();
	}
	
	public static void reset() {
		restTemplate = new RestTemplate();
		forecasts = new HashMap<>();
		locations = new HashMap<>();
		lastUpdateTime = System.currentTimeMillis() / 1000L - 901;
	}

}
