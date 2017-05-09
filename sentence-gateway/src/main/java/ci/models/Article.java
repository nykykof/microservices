package ci.models;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ci.dao.WordDao;

@FeignClient("ARTICLE")
public interface Article {

	@RequestMapping(value="/", method=RequestMethod.GET)
	WordDao getWord();

}
