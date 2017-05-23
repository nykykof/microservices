package ci.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import ci.dao.WordDao;
import ci.models.Adjective;
import ci.models.Article;
import ci.models.Noun;
import ci.models.Subject;
import ci.models.Verb;
import ci.models.Word;

@Service
public class WordService implements Word {

	@Autowired Verb verbClientx;
	@Autowired Subject subjectClient;
	@Autowired Article articleClient;
	@Autowired Adjective adjectiveClient;
	@Autowired Noun nounClient;
	
	
	@Override
	@HystrixCommand(fallbackMethod="getFallbackSubject")
	public WordDao getSubject() {
		return subjectClient.getWord();
	}
	public WordDao getFallbackSubject(){
		
		return new WordDao("Someone");
	}
	
	@Override
	@HystrixCommand(fallbackMethod="verbFallback")
	public WordDao getVerb() {
		return verbClientx.getWord();
	}
	public WordDao verbFallback(){
		
		return new WordDao("do");
	}
	
	@Override
	@HystrixCommand(fallbackMethod="articleFallback")
	public WordDao getArticle() {
		return articleClient.getWord();
	}
	public WordDao articleFallback(){
		
		return new WordDao("");
	}
	
	@Override
	@HystrixCommand(fallbackMethod="getFallbackAdjective")
	public WordDao getAdjective() {
		return adjectiveClient.getWord();
	}
	
	public WordDao getFallbackAdjective(){
		
		return new WordDao("");
	}
	
	@Override
	@HystrixCommand(fallbackMethod="getFallbackNoun")
	public WordDao getNoun() {
		return nounClient.getWord();
	}
	public WordDao getFallbackNoun(){
		
		return new WordDao("Something");
	}
	
}
