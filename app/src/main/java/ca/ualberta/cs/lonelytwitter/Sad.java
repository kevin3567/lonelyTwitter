package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by qikai on 9/12/17.
 */

/**
 * Represents a tweet.
 *
 * @author qikai
 * @version 1.5
 * @see Mood
 * @since 1.0
 */
public class Sad extends Mood{

    /**
     * Constructor
     */
    public Sad() {
        super();
    }

    /**
     * Constructor
     *
     * @param date
     */
    public Sad(Date date) {
        super(date);
    }

    /**
     * Convert to string
     *
     * @return string
     */
    @ Override
    public String toString() {
        return "Sad";
    }

}
