package fuse.felix.consumer.felixconsumer.impl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import fuse.felix.felixtest.service.Produce;


public class HelloWorldConsumer implements ActionListener {


	 private Produce produceService;

	 HelloWorldConsumer(Produce service){
		 
		 produceService = service;
	 }
	 
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		produceService.sendMessage();
	}


	
	
}
