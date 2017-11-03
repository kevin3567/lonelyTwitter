package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by qikai on 9/12/17.
 */

/**
 * Represents a normal tweet.
 *
 * @author qikai
 * @version 1.5
 * @see Tweet
 */

public class NormalTweet extends Tweet{
    /**
     * Constructor
     *
     * @param message
     */
    public NormalTweet (String message){
        super(message);
    }

    /**
     * Constructor
     *
     * @param message
     * @param date
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Provides tweet importance
     *
     * @return tweet importance
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }

}
