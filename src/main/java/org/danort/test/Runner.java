package org.danort.test;

import java.util.HashMap;
import java.util.logging.Logger;

import com.google.gson.GsonBuilder;

public class Runner {

	public static void main(String[] args) {

		Logger log = Logger.getLogger(Runner.class.getName());

		var map = new HashMap<String, String>();
		map.put("a", "b");
		map.put("c", "d");

		var mapJsonString = new GsonBuilder().setPrettyPrinting().create().toJson(map);

		log.info(mapJsonString);

	}

}