package groundstation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Messdaten {

	@JsonProperty("pid")
	private int pid;
	@JsonProperty("x")
	private int x;
	@JsonProperty("x")
	private int y;
	@JsonProperty("ground")
	private String ground;
	@JsonProperty("temperature")
	private double temperature;
	
	public Messdaten (){
		
	}
	public Messdaten(int pid, int x, int y, String ground, double temperature) {
		this.pid = pid;
		this.x = x;
		this.y = y;
		this.ground = ground;
		this.temperature = temperature;
	}
	
	public int getPid() {
		return pid;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public String getGround() {
		return ground;
	}
	
	public double getTemperature() {
		return temperature;
	}
}
