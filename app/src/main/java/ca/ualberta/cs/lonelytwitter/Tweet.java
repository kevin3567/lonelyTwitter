package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by qikai on 9/12/17.
 */

public abstract class Tweet {
    private String message;
    private Date date;
    private ArrayList<Mood> moodList;

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140) {
            throw new TweetTooLongException();
        }
        else {
            this.message = message;
        }
    }

    public String toString() {
        return date.toString() + "|" + message;
    }

    public String getMessage() {
        return this.message;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<Mood> getMood() {
        return this.moodList;
    }

    public void setMood(ArrayList<Mood> moodList) {
        this.moodList = moodList;
    }

    public void addMood(Mood mood) {
        this.moodList.add(mood);
    }

    public void delMood(Mood mood) {
        this.moodList.remove(mood);
    }

    public abstract Boolean isImportant();
}

