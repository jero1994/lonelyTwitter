package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import java.util.ArrayList;

/**
 * Created by ohman on 1/12/16.
 */
public abstract class Tweet {
    private ArrayList<Mood> moodList;
    private Date date;
    private String message;

    public abstract Boolean isImportant();

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }

    public void setMoods(ArrayList<Mood> moodlist) {
        this.moodList = moodlist;
    }

}
