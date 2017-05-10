package org.mule.modules.second.config;

import org.mule.api.annotations.components.Configuration;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.param.Default;

@Configuration(friendlyName = "Configuration")
public class ConnectorConfig {

/*    @Configurable
    @Default("http://sitecorepoc/sitecore/")
    private String greeting;

    @Configurable
    @Default("api/ssc/item/")
    private String reply;*/
    
    @Configurable
    @Default("http://sitecorepoc/sitecore/")
    private String baseUrl;
    
    @Configurable
    @Default("admin")
    private String username;
    
    @Configurable
    @Default("b")
    private String password;
    


    /**
     * getters and setters
     */
	/*public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return this.greeting;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public String getReply() {
        return this.reply;
    }
    */
    public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}