package com.rest.dao;

import java.io.IOException;
import java.util.ArrayList;

import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.swing.text.BadLocationException;

import com.rest.beans.Movie;
import com.rest.dao.ExtractJsonData;
import com.rest.dao.FeedObjects;
public class ProjectManager {
	
	public ArrayList<Movie> GetMovies(int pageNum) throws IOException, BadLocationException {
		ArrayList<Movie> feeds = new ArrayList<Movie>();
		if (pageNum < 1 || pageNum > 4) {
			return feeds;
		}
		ExtractJsonData ej = new ExtractJsonData();
		JsonArray jsonObjects = (JsonArray) ej.getInstance();
		for (int i = (pageNum - 1) * 6; i < pageNum * 6; i++) {
			JsonObject jsonObject = (JsonObject) jsonObjects.getJsonObject(i);
			FeedObjects.feed(jsonObject, feeds);
		}
		return feeds;
	}
	
	public ArrayList<Movie> GetMovies() throws IOException, BadLocationException {
		ArrayList<Movie> feeds = new ArrayList<Movie>();
		ExtractJsonData ej = new ExtractJsonData();
		JsonArray jsonObjects = (JsonArray) ej.getInstance();
		for (int i = 0; i < jsonObjects.size(); i++) {
			JsonObject jsonObject = (JsonObject) jsonObjects.getJsonObject(i);
			FeedObjects.feed(jsonObject, feeds);
		}
		return feeds;
	}
}
