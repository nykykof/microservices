package ci.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ci.dao.SentenceDao;
import ci.service.SentenceService;



@Controller
public class SentenceController {

	@Autowired SentenceService sentenceService;
	
	@CrossOrigin
	@RequestMapping("/sentence")
	public @ResponseBody SentenceDao getSentence() {
		
		 return new SentenceDao(sentenceService.buildSentence()) ;

	}

	
	
}
