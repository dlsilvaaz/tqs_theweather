package tqs.hw.TheWeather;

public class Location {
	
	private int idRegiao;
    private String idAreaAviso;
    private int idConcelho;
    private int globalIdLocal;
    private String latitude;
    private int idDistrito;
    private String local;
    private String longitude;
	public int getIdRegiao() {
		return idRegiao;
	}
	public void setIdRegiao(int idRegiao) {
		this.idRegiao = idRegiao;
	}
	public String getIdAreaAviso() {
		return idAreaAviso;
	}
	public void setIdAreaAviso(String idAreaAviso) {
		this.idAreaAviso = idAreaAviso;
	}
	public int getIdConcelho() {
		return idConcelho;
	}
	public void setIdConcelho(int idConcelho) {
		this.idConcelho = idConcelho;
	}
	public int getGlobalIdLocal() {
		return globalIdLocal;
	}
	public void setGlobalIdLocal(int globalIdLocal) {
		this.globalIdLocal = globalIdLocal;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public int getIdDistrito() {
		return idDistrito;
	}
	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	@Override
	public String toString() {
		return "Location [idRegiao=" + idRegiao + ", idAreaAviso=" + idAreaAviso + ", idConcelho=" + idConcelho
				+ ", globalIdLocal=" + globalIdLocal + ", latitude=" + latitude + ", idDistrito=" + idDistrito
				+ ", local=" + local + ", longitude=" + longitude + "]";
	}
    
    
    
}

