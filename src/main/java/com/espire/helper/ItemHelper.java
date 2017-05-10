package com.espire.helper;

import java.util.ArrayList;
import java.util.List;

import com.espire.json.cmis.Object;
import com.espire.json.cmis.Property;
import com.espire.json.sitecore.Item;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ItemHelper {

	public static Item jsonStringToObject(String jsonString) {
		ObjectMapper mapper = new ObjectMapper();
		Item obj = null;
		try {
			obj = mapper.readValue(jsonString, Item.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

	public static String objectToJsonString(Item jsonObject) {
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = null;
		try {
			jsonInString = mapper.writeValueAsString(jsonObject);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return jsonInString;
	}
	
	//anshul remove this duplicate method
	public static String objectToJsonString(Object jsonObject) {
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = null;
		try {
			jsonInString = mapper.writeValueAsString(jsonObject);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return jsonInString;
	}

	public static Object itemToObject(Item jsonObject) {
		Object jsonInString = new Object();
		List<Property> properties = jsonInString.getCmisPropertiesType();
		
		if(properties == null){
			properties = new ArrayList<Property>();
		}
		
		if(jsonObject.getItemID() != null && jsonObject.getItemID() != "null"){
			properties.add( new Property("ObjectID",jsonObject.getItemID()));
		}
		
		if(jsonObject.getItemName() != null && jsonObject.getItemName() != "null"){
			properties.add( new Property("ItemName",jsonObject.getItemName()));
		}
		
		if(jsonObject.getItemPath() != null && jsonObject.getItemPath() != "null"){
			properties.add( new Property("ItemPath",jsonObject.getItemPath()));
		}
		
		if(jsonObject.getParentID() != null && jsonObject.getParentID() != "null"){
			properties.add( new Property("ParentID",jsonObject.getParentID()));
		}
		
		if(jsonObject.getTemplateID() != null && jsonObject.getTemplateID() != "null"){
			properties.add( new Property("TemplateID",jsonObject.getTemplateID()));
		}
		
		if(jsonObject.getTemplateName() != null && jsonObject.getTemplateName() != "null"){
			properties.add( new Property("TemplateName",jsonObject.getTemplateName()));
		}
		
		if(jsonObject.getCloneSource() != null && jsonObject.getCloneSource() != "null"){
			properties.add( new Property("CloneSource",jsonObject.getCloneSource()));
		}
		
		if(jsonObject.getItemLanguage() != null && jsonObject.getItemLanguage() != "null"){
			properties.add( new Property("ItemLanguage",jsonObject.getItemLanguage()));
		}
		
		if(jsonObject.getItemVersion() != null && jsonObject.getItemVersion() != "null"){
			properties.add( new Property("ItemVersion",jsonObject.getItemVersion()));
		}

		if(jsonObject.getDisplayName() != null && jsonObject.getDisplayName() != "null"){
			properties.add( new Property("DisplayName",jsonObject.getDisplayName()));
		}
		
		if(jsonObject.getHasChildren() != null && jsonObject.getHasChildren() != "null"){
			properties.add( new Property("HasChildren",jsonObject.getHasChildren()));
		}
		
		if(jsonObject.getItemIcon() != null && jsonObject.getItemIcon() != "null"){
			properties.add( new Property("ItemIcon",jsonObject.getItemIcon()));
		}
		
		if(jsonObject.getItemMedialUrl() != null && jsonObject.getItemMedialUrl() != "null"){
			properties.add( new Property("ItemMedialUrl",jsonObject.getItemMedialUrl()));
		}
		
		if(jsonObject.getItemUrl() != null && jsonObject.getItemUrl() != "null"){
			properties.add( new Property("ItemUrl",jsonObject.getItemUrl()));
		}
		
		if(jsonObject.getText() != null && jsonObject.getText() != "null"){
			properties.add( new Property("Text",jsonObject.getText()));
		}
		
		if(jsonObject.getTitle() != null && jsonObject.getTitle() != "null"){
			properties.add( new Property("Title",jsonObject.getTitle()));
		}
		
		jsonInString.setCmisPropertiesType(properties);
		//anshul add more property
		return jsonInString;
	}
	

}
