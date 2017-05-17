package ci.models;

import ci.dao.WordDao;

public interface Word {

	WordDao getSubject();
	WordDao getVerb();
	WordDao getArticle();
	WordDao getAdjective();
	WordDao getNoun();
	
}
