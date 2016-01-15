package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ohman on 1/15/16.
 */
public class HappyMood extends Mood {

    public HappyMood(Date moodDate) {
        super(moodDate);
    }

    public HappyMood() {
        super();
    }


    @Override
    public String getMoodString() {
        return "Happy! :)";
    }
}
