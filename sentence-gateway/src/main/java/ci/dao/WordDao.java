package ci.dao;

/**
 * 'Word' object is nicely represented in JSON over a regular String.
 */
public class WordDao {

	public String word;

	public WordDao() {
		super();
	}	
	
	public WordDao(String word) {
		this();
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	
}
