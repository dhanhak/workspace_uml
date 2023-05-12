package e05_assoclation_composition;

import java.util.ArrayList;
import java.util.List;

public class Human {
	private List<Heart> heart = new ArrayList<Heart>();
	private Eyes eyes = new Eyes();
	
	
	public Human() {
		super();
	}
	public Human(List<Heart> heart, Eyes eyes) {
		super();
		this.heart = heart;
		this.eyes = eyes;
	}
	public List<Heart> getHeart() {
		return heart;
	}
	public void setHeart(List<Heart> heart) {
		this.heart = heart;
	}
	public Eyes getEyes() {
		return eyes;
	}
	public void setEyes(Eyes eyes) {
		this.eyes = eyes;
	}
	
	

}
