package edu.asu.diging.tutorial.spring.web;
 
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
 
import edu.asu.diging.tutorial.spring.service.MoodService;
import edu.asu.diging.tutorial.spring.service.MoodServiceInterface;
 
@Controller
public class HomeController {
 
    @Autowired
    private MoodServiceInterface service;
    
    @PostConstruct
    public void init(){
		service.List();
	}
    @RequestMapping(value = "/explanation")
	public String reason(ModelMap map){
		map.addAttribute("mood", service.getCurrentMood());
		return "explanation";}
    @RequestMapping(value = "/")
    public String home(ModelMap map) {
        map.addAttribute("mood", service.getCurrentMood());
        return "index";
        
    }
}