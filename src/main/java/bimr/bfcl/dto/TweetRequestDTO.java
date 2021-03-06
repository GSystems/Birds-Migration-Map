package bimr.bfcl.dto;

import java.util.Date;

/**
 * @author GLK
 */
public class TweetRequestDTO {

	private String hashtag;
	private Long lastTweetId;
	private Date untilDate;

	public TweetRequestDTO(String hashtag, Long lastTweetId, Date untilDate) {
		this.hashtag = hashtag;
		this.lastTweetId = lastTweetId;
		this.untilDate = untilDate;
	}

	public TweetRequestDTO(String hashtag, Long lastTweetId) {
		this.hashtag = hashtag;
		this.lastTweetId = lastTweetId;
	}

	public String getHashtag() {
		return hashtag;
	}

	public Long getLastTweetId() {
		return lastTweetId;
	}

	public Date getUntilDate() {
		return untilDate;
	}

}
