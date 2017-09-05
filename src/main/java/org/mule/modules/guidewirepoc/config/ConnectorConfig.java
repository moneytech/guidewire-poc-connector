package org.mule.modules.guidewirepoc.config;

import org.mule.api.annotations.components.Configuration;
import org.mule.api.annotations.display.*;
import org.mule.api.annotations.Configurable;

@Configuration(friendlyName = "Configuration")
public class ConnectorConfig {

	@Configurable
	@Placement(group = "Connection Settings")
	@FriendlyName("Guidewire Host")
	private String guidewireHost;
	
	@Configurable
	@Placement(group = "Authentication Settings", order = 1)
	@FriendlyName("Key")
	@Summary("Key for authentication")
	private String consumerKey;

	@Configurable
	@Placement(group = "Authentication Settings", order = 2)
	@FriendlyName("Secret")
	@Summary("Secret for authentication")
	private String consumerSecret;
	
	public String getGuidewireHost() {
		return this.guidewireHost;
	}
	
	public String getConsumerKey() {
		return this.consumerKey;
	}
	
	public String getConsumerSecret() {
		return this.consumerSecret;
	}
	
	public void setGuidewireHost(String guidewireHost) {
		this.guidewireHost = guidewireHost;
	}
	
	public void setConsumerKey(String consumerKey) {
		this.consumerKey = consumerKey;
	}
	
	public void setConsumerSecret(String consumerSecret) {
		this.consumerSecret = consumerSecret;
	}	
}