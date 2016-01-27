package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.Date;

/**
 * Created by ohman on 1/26/16.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAdd() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Sup");

        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testHasTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Sup");
        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
        Tweet newTweet = tweet;
        assertTrue(tweets.hasTweet(newTweet));
    }

    public void testRemoveTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Sup");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
        tweets.removeTweet(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testGetTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Sup");
        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testAddTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Sup");
        assertFalse(tweets.hasTweet(tweet));
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
        try {
            tweets.addTweet(tweet);
            fail();
        } catch (IllegalArgumentException e) {
            assertTrue(tweets.hasTweet(tweet));
        }
    }

    public void testGetTweets() {
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("Sup");
        Tweet tweet2 = new NormalTweet("Sup");
        tweets.addTweet(tweet1);
        tweets.addTweet(tweet2);
        assertEquals(tweets.getTweets().get(0), tweet1);
        assertEquals(tweets.getTweets().get(1), tweet2);
    }

    public void testGetCount() {
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("Sup");
        Tweet tweet2 = new NormalTweet("Sup");
        Tweet tweet3 = new NormalTweet("Sup");
        assertEquals(tweets.getCount(), 0);
        tweets.addTweet(tweet1);
        assertEquals(tweets.getCount(), 1);
        tweets.addTweet(tweet2);
        assertEquals(tweets.getCount(), 2);
        tweets.addTweet(tweet3);
        assertEquals(tweets.getCount(), 3);
        tweets.removeTweet(tweet3);
        assertEquals(tweets.getCount(), 2);
        tweets.removeTweet(tweet2);
        assertEquals(tweets.getCount(), 1);
        tweets.removeTweet(tweet1);
        assertEquals(tweets.getCount(), 0);
    }
}
