package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ohman on 1/15/16.
 */
public class SadMood extends Mood {
    public SadMood(Date moodDate) {
        super(moodDate);
    }

    public SadMood() {
        super();
    }

    @Override
    public String getMoodString() {
        return "Sad :(";
    }
}
