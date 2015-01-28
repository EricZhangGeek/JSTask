package com.rest.dao;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import javax.json.Json;
import javax.json.JsonReader;
import javax.json.JsonStructure;
import javax.swing.text.BadLocationException;
public class ExtractJsonData {
	private static JsonStructure instance;
	private synchronized void syncInit() throws IOException, BadLocationException {
      if (instance == null) {
		  URL url = this.getClass().getClassLoader().getResource("/");
		  String filePath = url.getFile();
		  String webAppLoc=new File(filePath).getParentFile().getParent();
		  String resLoc=webAppLoc+"/rawdata.json";
		  JsonReader reader = Json.createReader(new FileReader(resLoc));
		  instance = reader.read();
      }
	}
	public JsonStructure getInstance() throws IOException, BadLocationException {
      if (instance == null) {
        syncInit();
      }
      return instance;
	}
	
	
}
