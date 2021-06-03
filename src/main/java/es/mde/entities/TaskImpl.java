package es.mde.entities;

import java.util.ArrayList;
import java.util.Collection;

public class TaskImpl implements Task{

	private String name;
	private String description;
	private int time;
	private Collection<EventImpl> events = new ArrayList<EventImpl>();
	private Collection<AssetImpl> persons = new ArrayList<AssetImpl>();

	public TaskImpl(String nombre, int tiempo, String description) {
		super();
		this.name = nombre;
		this.description = description;
		this.time = tiempo;
	}

	public TaskImpl() {

	}

	public String toString() {
		return name + " " + ", tiempo: " + time;
	}

	public String getName() {
		return name;
	}

	public int getTime() {
		return time;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Collection<EventImpl> getEvents() {
		return events;
	}

	public void setEvents(Collection<EventImpl> events) {
		this.events = events;
	}

	public Collection<AssetImpl> getPersons() {
		return persons;
	}

	public void setPersons(Collection<AssetImpl> persons) {
		this.persons = persons;
	}

	@Override
	public Collection<String> minimumAssets() {
		
		return null;
	}
}
