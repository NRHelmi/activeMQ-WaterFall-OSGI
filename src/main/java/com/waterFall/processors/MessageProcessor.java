package com.waterFall.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;


public class MessageProcessor implements Processor {
	
	private static final Logger logger = Logger.getLogger(MessageProcessor.class);
	
	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("Processed by "+exchange.getContext().getName());
		
	}

}
