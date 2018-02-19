package com.quote;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
	
	private static final Logger log = LoggerFactory.getLogger(Controller.class);

	@RequestMapping(value = "/")
	public Quote display() {
		Quote quote = new Quote();
		try {
		RestTemplate restTemplate = new RestTemplate();
		quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		log.info(quote.toString());
		}
		catch(Exception e) {
			log.info(e.getMessage());			
		}
		return quote;
		
	}	

}
