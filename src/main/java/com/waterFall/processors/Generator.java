package com.waterFall.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class Generator implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("Wow my process is working");
	}

}
