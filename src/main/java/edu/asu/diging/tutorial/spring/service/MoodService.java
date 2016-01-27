package edu.asu.diging.tutorial.spring.service;
 
import java.util.Random;

import org.springframework.stereotype.Service;
 
import edu.asu.diging.tutorial.spring.domain.Mood;
 
@Service
public class MoodService implements MoodServiceInterface{
	String[] moods;
	String[] explanation;
 
    public Mood getCurrentMood() {
    	Random random=new Random();
    	int element=random.nextInt(moods.length);
    	return new Mood(moods[element],explanation[element]);
       
    }
    public void List() {
		moods = new String[] {"happy", "sad", "hungry"};
		explanation = new String[] {"live life", "not interested", "give me food"};	
    }}