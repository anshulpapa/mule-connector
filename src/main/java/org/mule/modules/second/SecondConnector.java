package org.mule.modules.second;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.modules.second.config.ConnectorConfig;

import com.espire.helper.ItemHelper;
import com.espire.json.cmis.Object;
import com.espire.json.sitecore.Item;
import com.espire.service.ItemService;

@Connector(name = "second", friendlyName = "EspireSitecore")
public class SecondConnector {

	@Config
	ConnectorConfig config;
	
	@Processor
	public String getObjectById(String objectId) {
		//call sitecore service
		Item sitecoreRes = ItemService.retrieveItemById(config.getBaseUrl().trim(), objectId.trim());
		
		//make response CMIS compliant
		Object cmisRes = ItemHelper.itemToObject(sitecoreRes);
		
		//return response as JSON string
		//return ItemHelper.objectToJsonString(sitecoreRes);
		return ItemHelper.objectToJsonString(cmisRes);
	}
	
	@Processor
	public void ApplyAcl(String objectId) {}
	
	@Processor
	public void ApplyAspect(String objectId) {}
	
	@Processor
	public void ApplyPolicy(String objectId) {}
	
	@Processor
	public void CancelCheckOut(String objectId) {}
	
	@Processor
	public void Changelog(String objectId) {}
	
	@Processor
	public void CheckIn(String objectId) {}
	
	@Processor
	public void CheckOut(String objectId) {}
	
	@Processor
	public void CreateDocumentById(String objectId) {}
	
	@Processor
	public void CreateDocumentByPath(String objectId) {}
	
	@Processor
	public void CreateFolder(String objectId) {}
	
	@Processor
	public void CreateRelationship(String objectId) {}
	
	@Processor
	public void Delete(String objectId) {}
	
	@Processor
	public void DeleteTree(String objectId) {}
	
	@Processor
	public void Folder(String objectId) {}
	
	@Processor
	public void GetAcl(String objectId) {}
	
	@Processor
	public void GetAllVersions(String objectId) {}
	
	@Processor
	public void GetAppliedPolicies(String objectId) {}
	
	@Processor
	public void GetCheckoutDocs(String objectId) {}
	
	@Processor
	public void GetContentStream(String objectId) {}
	
	@Processor
	public void GetObjectByPath(String objectId) {}
	
	@Processor
	public void GetObjectRelationships(String objectId) {}
	
	@Processor
	public void GetOrCreateFolderByPath(String objectId) {}
	
	@Processor
	public void GetParentFolder(String objectId) {}
	
	@Processor
	public void GetTypeDefinition(String objectId) {}
	
	@Processor
	public void MoveObject(String objectId) {}
	
	@Processor
	public void Query(String objectId) {}
	
	@Processor
	public void Repositories(String objectId) {}
	
	@Processor
	public void RepositoryInfo(String objectId) {}
	
	@Processor
	public void UpdateObjectProperties(String objectId) {}	

	public ConnectorConfig getConfig() {
		return config;
	}

	public void setConfig(ConnectorConfig config) {
		this.config = config;
	}

}