package tqs.hw.TheWeather;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Set;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class ForecastController {
	
	@GetMapping("/forecast/{id}")
	public Forecast forecast(@PathVariable String id) throws UnsupportedEncodingException{
		return Cache.getForecast(id);
	}
	
	@GetMapping("/locations")
	public Set<String> forecast(){
		return Cache.getLocations();
	}

}
