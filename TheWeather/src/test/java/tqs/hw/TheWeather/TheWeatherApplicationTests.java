package tqs.hw.TheWeather;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Set;

import org.junit.Test;

public class TheWeatherApplicationTests {
	
	@Test
	public void testSetup() {
		assertEquals(true, Cache.forecasts.isEmpty());
		assertEquals(true, Cache.locations.isEmpty());
		Cache.setup();
		assertEquals(false, Cache.forecasts.isEmpty());
		assertEquals(false, Cache.locations.isEmpty());
		Cache.reset();
	}

	@Test
	public void testGetLocations() {
		assertEquals(true, Cache.getLocations().isEmpty());
		Cache.setup();
		assertEquals(false, Cache.getLocations().isEmpty());
		Cache.reset();
	}
	
	@Test
	public void testGetForecast() {
		assertEquals(null, Cache.getForecast("Test Locations"));
		Forecast f = new Forecast();
		Cache.forecasts.put("Test Locations", f);
		assertEquals(f, Cache.getForecast("Test Locations"));
		Cache.reset();
	}
	
	@Test
	public void testGetForecastByLocation() {
		Cache.setup();
		Set<String> locations = Cache.getLocations();
		for(String l : locations) {
			assertNotEquals(null, Cache.getForecast(l));
		}
		Cache.reset();
	}
	
	@Test
	public void testFetch() throws InterruptedException {
		Cache.setup();
		long time = Cache.lastUpdateTime;
		Thread.sleep(1500);
		Cache.fetch();
		assertEquals(false, Cache.lastUpdateTime == time);
		Cache.reset();
	}
	
}
