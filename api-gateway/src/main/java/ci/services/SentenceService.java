package ci.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ci.dao.SentenceDao;
import ci.models.SentenceMod;


@Service
public class SentenceService {

	@Autowired SentenceMod sentenceModel;
	public SentenceDao getSentence(){
		
		return sentenceModel.getSentence();
	}
}
