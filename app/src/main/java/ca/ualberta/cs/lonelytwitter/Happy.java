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
public class Happy extends Mood {
    /**
     * Constructor
     *
     * @param date
     */
    public Happy(Date date) {
        super(date);
    }

    /**
     * Constructor
     *
     */
    public Happy() {
        super();
    }

    /**
     * Convert to String
     *
     * @return string
     */
    public String toString() {
        return "Happy";
    }
}
