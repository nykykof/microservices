package rm.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import rm.dao.Challenge;

@RestController
@RequestMapping("/challenge")
@CrossOrigin("*")
public class Md5ChallengeController {

	@Value("${md5.length}") int length; //parameter defined in application.yml on github repo
	@RequestMapping(value="/md5", produces={"application/json"})
	
	public @ResponseBody Challenge getChallenge(){
		
		String challenge = "";
		
		for(int i=0;i<length;i++){			
			challenge = challenge+String.valueOf(((int)Math.round(Math.random()*10))); 
		}
		
		return new Challenge(challenge);
	}
}
