package com.rest.service;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.text.BadLocationException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.json.JSONException;

import com.rest.beans.Movie;
import com.rest.dao.ProjectManager;
import com.rest.transformer.FeedsTransformer;
@Path("/jsonservice")
public class FetchDataService {
	  @GET
	  @Produces("application/json")
	  public String convertFtoC() throws JSONException, FileNotFoundException {
		  String feeds = null;
		  try {
			  ArrayList<Movie> feedData = null;
			  ProjectManager projectManager= new ProjectManager();
			  feedData = projectManager.GetMovies();
			  feeds = FeedsTransformer.movieFeed(feedData);
		  } catch (Exception e) {
			  System.out.println(e.toString());
			  System.out.println("Exception Error"); //Console 
		  }
		  return feeds;
	  }
	  
	  @Path("{page}")
	  @GET
	  @Produces("application/json")
	  public String convertPage(@PathParam("page") int page) throws JSONException, IOException, BadLocationException {
		String feeds = null;
		  try {
			  ArrayList<Movie> feedData = null;
			  ProjectManager projectManager= new ProjectManager();
			  feedData = projectManager.GetMovies(page);
			  feeds = FeedsTransformer.movieFeed(feedData);
		  } catch (Exception e) {
			  System.out.println(e.toString());
			  System.out.println("Exception Error"); //Console 
		  }
		  return feeds;
	  }
	  
}
