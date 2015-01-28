package com.rest.dao;

import java.util.ArrayList;

import javax.json.JsonObject;

import com.rest.beans.Links;
import com.rest.beans.Movie;

public class FeedObjects {
	public static void feed(JsonObject jsonObject, ArrayList<Movie> feeds) {
		Movie movie = new Movie();
		movie.setType(jsonObject.getString("type"));
		movie.setId(jsonObject.getString("id"));
		movie.setTitle(jsonObject.getString("title"));
		movie.setShortDescription(jsonObject.getString("shortDescription"));
		movie.setLongDescription(jsonObject.getString("longDescription"));
		movie.setLiveBroadcastTime(jsonObject.getString("liveBroadcastTime"));
		movie.setShowTitle(jsonObject.getString("showTitle"));
		movie.setChannelTitle(jsonObject.getString("channelTitle"));
		movie.setSeason(jsonObject.getString("season"));
		movie.setEpisode(jsonObject.getString("episode"));
		movie.setDuration(jsonObject.getString("duration"));
		movie.setParentalGuidance(jsonObject.getString("parentalGuidance"));
		
		JsonObject jsonlinks = (JsonObject) jsonObject.get("links");
		Links links = new Links();
		links.setLogo_image(jsonlinks.getString("logo-image"));
		links.setUserVideoDetails(jsonlinks.getString("userVideoDetails"));
		links.setTemplate_image(jsonlinks.getString("template-image"));
		links.setShow(jsonlinks.getString("show"));
		links.setChannel(jsonlinks.getString("channel"));
		links.setSelf(jsonlinks.getString("self"));
		links.setPublisher(jsonlinks.getString("publisher"));
		links.setDefault_image(jsonlinks.getString("default-image"));
		links.setCell_image(jsonlinks.getString("cell-image"));
		links.setChannel_subscription_status(jsonlinks.getString("channel-subscription-status"));
		movie.setLinks(links);
		
		movie.setShowId(jsonObject.getString("showId"));
		movie.setChannelId(jsonObject.getString("channelId"));
		movie.setPlaybackItems(jsonObject.getJsonArray("playbackItems"));
		feeds.add(movie);
	}
}
