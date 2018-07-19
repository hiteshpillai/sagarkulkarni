package com.capgemini.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bean.Message;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String sayHello(){
		return "Hey, Hitesh";
	}
	
	@RequestMapping("/message")
	public String messagePrint() {
		Message msg = new Message();
		msg.setMessage("This message is from the method of class");
		return msg.getMessage();
	}
	
	@RequestMapping(value="/sendString", method=RequestMethod.POST)
	public String recieveMessage(String string) {
		return "server recieved "+string;
	}
	
	@RequestMapping(value="/sendMessage", method=RequestMethod.POST)
	public Message recieveMessageObject(Message msg) {
		return msg;
	}
}
