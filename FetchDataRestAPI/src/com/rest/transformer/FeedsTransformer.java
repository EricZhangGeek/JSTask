package com.rest.transformer;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.rest.beans.Movie;

public class FeedsTransformer {
	public static String movieFeed(ArrayList<Movie> feedData) {
		String feeds = null;
		Gson gson = new Gson();
		feeds = gson.toJson(feedData);
		return feeds;
	}
}