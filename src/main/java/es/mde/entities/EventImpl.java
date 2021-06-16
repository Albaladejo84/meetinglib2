package es.mde.entities;

import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;


public class EventImpl implements Event{

	private String place;
	private LocalDateTime begining;
	
	
	public EventImpl() {

	}

	public EventImpl(String place, LocalDateTime begining) {
		super();
		this.begining = begining;
		this.place = place;
	}


	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public LocalDateTime getBegining() {
		return begining;
	}

	public void setBegining(LocalDateTime begining) {
		this.begining = begining;
	}



	@Override
	public boolean assetsConfirmed() {
		
		return true;
	}
	
}
