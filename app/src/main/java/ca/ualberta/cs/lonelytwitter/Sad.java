package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by qikai on 9/12/17.
 */

public class Sad extends Mood{

    public Sad() {
        super();
    }

    public Sad(Date date) {
        super(date);
    }

    @ Override
    public String toString() {
        return "Sad";
    }

}
