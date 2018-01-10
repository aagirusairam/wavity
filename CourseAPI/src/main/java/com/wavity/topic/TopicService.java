package com.wavity.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics= new ArrayList<>(Arrays.asList(
			new Topic("spring", "Spring Framework", "desc"),
			new Topic("core java", "core java ", " java desc"),
			new Topic("html", "html Framework", " html desc")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id){
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get(); //-> is a lambda expression
	}
	public void addTopic(Topic topic){
		topics.add(topic);
	}
	public void updateTopic(String id, Topic topic) {
		for(int i=0; i<topics.size();i++) {
			Topic t= topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return ;
			}
		}
	}
	public void deleteTopic(String id, Topic topic) {
		topics.removeIf(t -> t.getId().equals(id));
	}
}
