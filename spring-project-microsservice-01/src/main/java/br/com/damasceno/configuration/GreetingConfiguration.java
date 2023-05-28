package br.com.damasceno.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("greeting-service") //para spring interpretar como classe que faz o binding de um arquivo de configurações com uma classe java
public class GreetingConfiguration {
	//o que tem dentro das aspas é a annotation configuration quem vai "olhar" no application.yml para pegar as configurações
	private String greeting;
	private String defaultValue;
	
	public GreetingConfiguration() {

	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	
	

	
}
