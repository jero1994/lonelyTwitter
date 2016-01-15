package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ohman on 1/12/16.
 */
public class ImportantTweet extends Tweet implements Tweetable {
    public ImportantTweet(String message) {
        super(message);
    }

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
