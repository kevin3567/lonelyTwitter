package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by qikai on 9/12/17.
 */

/**
 * Represents a mood.
 *
 * @author qikai
 * @version 1.5
 * @see Happy
 * @see Sad
 * @since 1.0
 */

public abstract class Mood {

    private Date date; /* date of mood creation */

    /**
     * Constructor
     *
     */
    public Mood () {
        this.date = new Date();
    }

    /**
     * Constructor
     *
     * @param date
     */
    public Mood (Date date) {
        this.date = date;
    }

    /**
     * Get date of creation
     *
     * @return date field
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * Set date of creation
     *
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Converts mood to string
     *
     * @return string
     */
    public abstract String toString();
}
