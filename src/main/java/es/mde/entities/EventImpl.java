package es.mde.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class EventImpl implements Event{

	private Collection<TaskImpl> eventTasksRequired = new ArrayList<TaskImpl>();
	private List<AssetImpl> requiredAssets = new ArrayList<AssetImpl>();
	private LocalDateTime begining;
	private LocalDateTime ending;
	private boolean confirmed;

	public EventImpl() {

	}

	public EventImpl(List<AssetImpl> requiredAssets, Collection<TaskImpl> eventTaskRequired, LocalDateTime begining) {
		super();
		this.eventTasksRequired = eventTaskRequired;
		this.requiredAssets = requiredAssets;
		this.begining = begining;
		this.confirmed = false;
	}

	public boolean isConfirmed() {
		return confirmed;
	}

	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}

	public Collection<TaskImpl> getEventTaskRequired() {
		return eventTasksRequired;
	}

	public LocalDateTime getBegining() {
		return begining;
	}

	public void setBegining(LocalDateTime begining) {
		this.begining = begining;
	}

	public LocalDateTime getEnding() {
		return ending;
	}

	public void setEnding(LocalDateTime ending) {
		this.ending = ending;
	}

	public List<AssetImpl> getRequiredAssets() {
		return requiredAssets;
	}

	public void setRequiredAssets(List<AssetImpl> requiredAssets) {

		this.requiredAssets = requiredAssets;
	}

	public void setEventTask(Collection<TaskImpl> eventTypesRequired) {
		this.eventTasksRequired = eventTypesRequired;
	}

	public void addAssetToRequiredList(AssetImpl newAsset) {
		requiredAssets.add(newAsset);
	}

	@Override
	public boolean checkAssetsCorrect() {
		
		return true;
	}
}
