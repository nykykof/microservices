package ci.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ci.models.Word;

/**
 * Build a sentence by assembling randomly generated subjects, verbs, 
 * articles, adjectives, and nouns.  The individual parts of speech will 
 * be obtained by calling the various DAOs.
 */
@Service
public class SentenceService{

	@Autowired Word wordService;
	

	/**
	 * Assemble a sentence by gathering random words of each part of speech:
	 */
	public String buildSentence() { 
		return  
			String.format("%s %s %s %s %s.",
				wordService.getSubject().getWord(),
				wordService.getVerb().getWord(),
				wordService.getArticle().getWord(),
				wordService.getAdjective().getWord(),
				wordService.getNoun().getWord() )
			;
	}	
}
