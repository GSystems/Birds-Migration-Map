package bimr.bfcl.dto;

import java.util.List;

public class HotspotDTO {
	private String informationSourceId;
	private List<String> birdSpecies;
	private String country;
	private String state;
	private String city;
	private String latitude;
	private String longitude;
	private String locationId;
	private String observationId;
	private String hotspotId;
	private String howMany;
	private String observationDate;
	private String tweetMessage;
	private String tweetId;
	private String link;
	private String author;
	private TwitterUserDTO user;

	public String getInformationSourceId() {
		return informationSourceId;
	}

	public void setInformationSourceId(String informationSourceId) {
		this.informationSourceId = informationSourceId;
	}

	public List<String> getBirdSpecies() {
		return birdSpecies;
	}

	public void setBirdSpecies(List<String> birdSpecies) {
		this.birdSpecies = birdSpecies;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getObservationId() {
		return observationId;
	}

	public void setObservationId(String observationId) {
		this.observationId = observationId;
	}

	public String getHotspotId() {
		return hotspotId;
	}

	public void setHotspotId(String hotspotId) {
		this.hotspotId = hotspotId;
	}

	public String getHowMany() {
		return howMany;
	}

	public void setHowMany(String howMany) {
		this.howMany = howMany;
	}

	public String getObservationDate() {
		return observationDate;
	}

	public void setObservationDate(String observationDate) {
		this.observationDate = observationDate;
	}

	public String getTweetMessage() {
		return tweetMessage;
	}

	public void setTweetMessage(String tweetMessage) {
		this.tweetMessage = tweetMessage;
	}

	public String getTweetId() {
		return tweetId;
	}

	public void setTweetId(String tweetId) {
		this.tweetId = tweetId;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public TwitterUserDTO getUser() {
		return user;
	}

	public void setUser(TwitterUserDTO user) {
		this.user = user;
	}

}
