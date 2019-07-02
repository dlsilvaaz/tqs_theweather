package tqs.hw.TheWeather;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {
	
	private String owner;
    private String country;
    private DailyForecast[] data;
    private int globalIdLocal;
    private String dataUpdate;
    
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
	public DailyForecast[] getData() {
		return data;
	}
	public void setData(DailyForecast[] data) {
		this.data = data;
	}
	public int getGlobalIdLocal() {
		return globalIdLocal;
	}
	public void setGlobalIdLocal(int globalIdLocal) {
		this.globalIdLocal = globalIdLocal;
	}
	public String getDataUpdate() {
		return dataUpdate;
	}
	public void setDataUpdate(String dataUpdate) {
		this.dataUpdate = dataUpdate;
	}
	@Override
	public String toString() {
		return "Forecast [owner=" + owner + ", country=" + country + ", data=" + Arrays.toString(data)
				+ ", globalIdLocal=" + globalIdLocal + ", dataUpdate=" + dataUpdate + "]";
	}

}
