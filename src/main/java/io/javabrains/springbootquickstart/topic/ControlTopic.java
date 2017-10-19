package io.javabrains.springbootquickstart.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlTopic {
	
	@Autowired
	private TopicServer topicserver;
	
	@RequestMapping("/topics") 
	public List<Topic>  AllTopics(){   //(
		return	topicserver.AllTopics();		
		 
	}
	

}
