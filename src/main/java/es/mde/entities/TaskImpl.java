package es.mde.entities;

public class TaskImpl{

	private String name;
	private String description;
	private int time;
	private float taskCost;

	public TaskImpl(String nombre, String description, int tiempo, float taskCost) {
		super();
		this.name = nombre;
		this.description = description;
		this.time = tiempo;
		this.taskCost = taskCost;
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
	public float getTaskCost() {
		return taskCost;
	}

	public void setTaskCost(float taskCost) {
		this.taskCost = taskCost;
	}

	

}
