package com.espire.json.sitecore;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"ItemID",
"ItemName",
"ItemPath",
"ParentID",
"TemplateID",
"TemplateName",
"CloneSource",
"ItemLanguage",
"ItemVersion",
"DisplayName",
"HasChildren",
"ItemIcon",
"ItemMedialUrl",
"ItemUrl",
"Text",
"Title"
})
public class Item {

@JsonProperty("ItemID")
private String itemID;
@JsonProperty("ItemName")
private String itemName;
@JsonProperty("ItemPath")
private String itemPath;
@JsonProperty("ParentID")
private String parentID;
@JsonProperty("TemplateID")
private String templateID;
@JsonProperty("TemplateName")
private String templateName;
@JsonProperty("CloneSource")
private String cloneSource;
@JsonProperty("ItemLanguage")
private String itemLanguage;
@JsonProperty("ItemVersion")
private String itemVersion;
@JsonProperty("DisplayName")
private String displayName;
@JsonProperty("HasChildren")
private String hasChildren;
@JsonProperty("ItemIcon")
private String itemIcon;
@JsonProperty("ItemMedialUrl")
private String itemMedialUrl;
@JsonProperty("ItemUrl")
private String itemUrl;
@JsonProperty("Text")
private String text;
@JsonProperty("Title")
private String title;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("ItemID")
public String getItemID() {
return itemID;
}

@JsonProperty("ItemID")
public void setItemID(String itemID) {
this.itemID = itemID;
}

@JsonProperty("ItemName")
public String getItemName() {
return itemName;
}

@JsonProperty("ItemName")
public void setItemName(String itemName) {
this.itemName = itemName;
}

@JsonProperty("ItemPath")
public String getItemPath() {
return itemPath;
}

@JsonProperty("ItemPath")
public void setItemPath(String itemPath) {
this.itemPath = itemPath;
}

@JsonProperty("ParentID")
public String getParentID() {
return parentID;
}

@JsonProperty("ParentID")
public void setParentID(String parentID) {
this.parentID = parentID;
}

@JsonProperty("TemplateID")
public String getTemplateID() {
return templateID;
}

@JsonProperty("TemplateID")
public void setTemplateID(String templateID) {
this.templateID = templateID;
}

@JsonProperty("TemplateName")
public String getTemplateName() {
return templateName;
}

@JsonProperty("TemplateName")
public void setTemplateName(String templateName) {
this.templateName = templateName;
}

@JsonProperty("CloneSource")
public String getCloneSource() {
return cloneSource;
}

@JsonProperty("CloneSource")
public void setCloneSource(String cloneSource) {
this.cloneSource = cloneSource;
}

@JsonProperty("ItemLanguage")
public String getItemLanguage() {
return itemLanguage;
}

@JsonProperty("ItemLanguage")
public void setItemLanguage(String itemLanguage) {
this.itemLanguage = itemLanguage;
}

@JsonProperty("ItemVersion")
public String getItemVersion() {
return itemVersion;
}

@JsonProperty("ItemVersion")
public void setItemVersion(String itemVersion) {
this.itemVersion = itemVersion;
}

@JsonProperty("DisplayName")
public String getDisplayName() {
return displayName;
}

@JsonProperty("DisplayName")
public void setDisplayName(String displayName) {
this.displayName = displayName;
}

@JsonProperty("HasChildren")
public String getHasChildren() {
return hasChildren;
}

@JsonProperty("HasChildren")
public void setHasChildren(String hasChildren) {
this.hasChildren = hasChildren;
}

@JsonProperty("ItemIcon")
public String getItemIcon() {
return itemIcon;
}

@JsonProperty("ItemIcon")
public void setItemIcon(String itemIcon) {
this.itemIcon = itemIcon;
}

@JsonProperty("ItemMedialUrl")
public String getItemMedialUrl() {
return itemMedialUrl;
}

@JsonProperty("ItemMedialUrl")
public void setItemMedialUrl(String itemMedialUrl) {
this.itemMedialUrl = itemMedialUrl;
}

@JsonProperty("ItemUrl")
public String getItemUrl() {
return itemUrl;
}

@JsonProperty("ItemUrl")
public void setItemUrl(String itemUrl) {
this.itemUrl = itemUrl;
}

@JsonProperty("Text")
public String getText() {
return text;
}

@JsonProperty("Text")
public void setText(String text) {
this.text = text;
}

@JsonProperty("Title")
public String getTitle() {
return title;
}

@JsonProperty("Title")
public void setTitle(String title) {
this.title = title;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}