package ci.models;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ci.dao.SentenceDao;

@FeignClient("SENTENCE-GATEWAY")
public interface SentenceMod {

	@RequestMapping(value="/sentence",method=RequestMethod.GET)
	SentenceDao getSentence();
}
