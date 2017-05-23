package ci.controller;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ci.dao.SentenceDao;
import ci.services.SentenceService;

@Controller
public class SentenceController {

	
	@RequestMapping("/")
	public String index(){
		
		return "index";
	}
	
	@Autowired SentenceService sentenceService;
	
	@RequestMapping("/sentence")
	public @ResponseBody SentenceDao sentence(){
		
		return sentenceService.getSentence();
	}
}
