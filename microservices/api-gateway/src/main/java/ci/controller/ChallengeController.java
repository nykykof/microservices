package ci.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ci.dao.Challenge;
import ci.services.ChallengeService;

@RestController
@RequestMapping("/api/challenge")
public class ChallengeController {

	@Autowired ChallengeService challengeservice;
	
	@RequestMapping("/md5")
	public @ResponseBody Challenge getMd5Challenge(){
		return challengeservice.getMd5Challenge();
	}
}
