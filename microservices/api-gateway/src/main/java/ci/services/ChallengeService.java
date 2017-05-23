package ci.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ci.dao.Challenge;
import ci.models.ChallengeMod;

@Service
public class ChallengeService {

	@Autowired ChallengeMod challengemodel;
	
	public Challenge getMd5Challenge(){
		
		return challengemodel.getMd5Challenge();
	}
}
