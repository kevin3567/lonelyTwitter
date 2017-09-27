package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by qikai on 9/12/17.
 */

/**
 * Represents an important tweet.
 *
 * @author qikai
 * @version 1.5
 * @see Tweet
 */


public class ImportantTweet extends Tweet implements Tweetable {
    /**
     * Constructor
     *
     * @param message
     */
    public ImportantTweet(String message) {
        super(message);
    }

    /**
     * Constructor
     *
     * @param message
     * @param date
     */
    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * provides string importance
     *
     * @return tweet importance
     */
    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

}
