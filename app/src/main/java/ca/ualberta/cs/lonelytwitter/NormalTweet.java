package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by qikai on 9/12/17.
 */

public class NormalTweet extends Tweet implements Tweetable {

    public NormalTweet (String message){
        super(message);
    }

    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }

}
