package ci.models;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ci.dao.Challenge;

@FeignClient("challenge")
public interface ChallengeMod {

	@RequestMapping(value="/challenge/md5", method=RequestMethod.GET)
	Challenge getMd5Challenge();
}
