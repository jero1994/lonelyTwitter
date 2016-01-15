package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ohman on 1/15/16.
 */
public abstract class Mood {

    private Date moodDate;

    public Mood(Date moodDate) {
        this.moodDate = moodDate;
    }

    public Mood() {
        this.moodDate = new Date(System.currentTimeMillis());
    }

    public Date getMoodDate() {
        return moodDate;
    }

    public void setMoodDate(Date moodDate) {
        this.moodDate = moodDate;
    }

    public abstract String getMoodString();

}
