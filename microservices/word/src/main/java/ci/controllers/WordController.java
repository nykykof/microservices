package ci.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ci.dao.Word;

@Controller
@RefreshScope
public class WordController {
	@Value("${words}") String words;	
	@RequestMapping("/")
	public @ResponseBody Word getWord(){			
		String[] wordArray = words.split(",");
		int i = (int)Math.round(Math.random()*(wordArray.length-1));
		return new Word(wordArray[i]);
	}
}
