package com.waterFall.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

public class Generator implements Processor {
	private final static Logger logger = Logger.getLogger(Generator.class);
	
	@Override
	public void process(Exchange exchange) throws Exception {
		logger.info("Generator messages triggred");
		
	}

}
