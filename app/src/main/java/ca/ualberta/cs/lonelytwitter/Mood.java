package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by qikai on 9/12/17.
 */

public abstract class Mood {

    Date date;

    public Mood () {
        this.date = new Date();
    }

    public Mood (Date date) {
        this.date = date;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String toString();
}
