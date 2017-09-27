package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by qikai on 9/12/17.
 */

/**
 * Interface for tweets
 *
 * @author qikai
 * @since 1.0
 * @deprecated
 */
public interface Tweetable {
    String getMessage();
    Date getDate();
}
