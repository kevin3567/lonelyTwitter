package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by qikai on 9/12/17.
 */

/**
 * Represents a tweet.
 *
 * @author qikai
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */

public abstract class Tweet {
    private String message;
    private Date date;
    private ArrayList<Mood> moodList;

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    /**
     *Constructs a tweet object
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    /**
     * Set tweet message
     *
     * @param message tweet message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140) {
            throw new TweetTooLongException();
        }
        else {
            this.message = message;
        }
    }

    /**
     * Abstract method
     * Determine if tweet is important
     *
     * @return
     */
    public abstract Boolean isImportant();

    /**
     * Convert tweet to string
     *
     * @return string representation of tweet
     */
    public String toString() {
        return date.toString() + "|" + message;
    }

    /**
     *
     * @return message_field
     */
    public String getMessage() {
        return this.message;
    }

    /**
     *
     * @return date_field
     */
    public Date getDate() {
        return this.date;
    }

    /**
     *
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Get the list of mood associated with tweet
     *
     * @return ArrayList<Mood>
     */
    public ArrayList<Mood> getMood() {
        return this.moodList;
    }

    /**
     * Set the list of mood associated with tweet
     *
     * @param moodList
     */
    public void setMood(ArrayList<Mood> moodList) {
        this.moodList = moodList;
    }

    /**
     * Add specified mood to list of mood associated with tweet
     *
     * @param mood
     */
    public void addMood(Mood mood) {
        this.moodList.add(mood);
    }

    /**
     * Remove specified mood from list of mood associated with tweet (if exists)
     *
     * @param mood
     */
    public void delMood(Mood mood) {
        this.moodList.remove(mood);
    }
}

