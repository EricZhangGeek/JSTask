package com.rest.beans;

import javax.json.JsonArray;
public class Movie {
	private String type;
	private String id;
	private String title;
	private String shortDescription;
	private String longDescription;
	private String liveBroadcastTime;
	private String showTitle;
	private String channelTitle;
	private String season;
	private String episode;
	private String duration;
	private String parentalGuidance;
	private Links links;
	private String showId;
	private String channelId;
	private JsonArray playbackItems;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getLongDescription() {
		return longDescription;
	}
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	public String getLiveBroadcastTime() {
		return liveBroadcastTime;
	}
	public void setLiveBroadcastTime(String liveBroadcastTime) {
		this.liveBroadcastTime = liveBroadcastTime;
	}
	public String getShowTitle() {
		return showTitle;
	}
	public void setShowTitle(String showTitle) {
		this.showTitle = showTitle;
	}
	public String getChannelTitle() {
		return channelTitle;
	}
	public void setChannelTitle(String channelTitle) {
		this.channelTitle = channelTitle;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getEpisode() {
		return episode;
	}
	public void setEpisode(String episode) {
		this.episode = episode;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getParentalGuidance() {
		return parentalGuidance;
	}
	public void setParentalGuidance(String parentalGuidance) {
		this.parentalGuidance = parentalGuidance;
	}
	public Links getLinks() {
		return links;
	}
	public void setLinks(Links links) {
		this.links = links;
	}
	public String getShowId() {
		return showId;
	}
	public void setShowId(String showId) {
		this.showId = showId;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public JsonArray getPlaybackItems() {
		return playbackItems;
	}
	public void setPlaybackItems(JsonArray playbackItems) {
		this.playbackItems = playbackItems;
	}


	
}
