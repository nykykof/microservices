package ci.dao;

public class SentenceDao {

	public String sentence;

	public SentenceDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SentenceDao(String sentence) {
		this();
		this.sentence = sentence;
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
}
