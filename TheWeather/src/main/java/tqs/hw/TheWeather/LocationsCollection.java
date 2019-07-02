package tqs.hw.TheWeather;

import java.util.Arrays;

public class LocationsCollection {
	private String owner;
    private String country;
    private Location[] data;
    
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Location[] getData() {
		return data;
	}
	public void setData(Location[] data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "LocationsCollection [owner=" + owner + ", country=" + country + ", data=" + Arrays.toString(data) + "]";
	}
    
    
    
}
