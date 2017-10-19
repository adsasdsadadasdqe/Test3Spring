package io.javabrains.springbootquickstart.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TopicServer {
	
	
	public List<Topic> topics = Arrays.asList (
			new Topic("A","BB","CCC"),
			new Topic("D","EE","FFF"),
			new Topic("G","HH","III")
			);

	public List<Topic>  AllTopics(){   //(
		return	topics;	
		 
	}
	
	
}
