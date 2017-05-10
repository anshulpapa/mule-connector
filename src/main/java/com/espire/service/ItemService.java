package com.espire.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.espire.helper.ItemHelper;
import com.espire.json.sitecore.Item;

public class ItemService {
	public static Item retrieveItemById(String baseUrl, String itemId){
		String value = "";
		String output = "";
		try {
			String urlString = baseUrl.trim()+"api/ssc/item/"+itemId.trim();
			URL url = new URL(urlString);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			while ((output = br.readLine()) != null) {
				value += output;
			}

			conn.disconnect();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return ItemHelper.jsonStringToObject(value);
	}
}