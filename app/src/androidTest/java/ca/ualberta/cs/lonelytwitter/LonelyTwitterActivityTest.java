package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.robotium.solo.Solo;

import junit.framework.TestCase;

public class LonelyTwitterActivityTest extends ActivityInstrumentationTestCase2 {
    private Solo solo;

    public LonelyTwitterActivityTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }

// Comment out all other tests
//    public void testStart() throws Exception {
//        Activity activity = getActivity();
//    }

//    public void testTweet() throws Exception {
//        solo.assertCurrentActivity("Wrong Activity", LonelyTwitterActivity.class);
//        solo.enterText((EditText) solo.getView(R.id.body), "Test Tweet!");
//        solo.clickOnButton("Save");
//
//        solo.enterText((EditText) solo.getView(R.id.body), "");
//        assertTrue(solo.waitForText("Test Tweet!"));
//        solo.clickOnButton("Clear");
//    }

//    public void testClickTweetList() throws Exception {
//        solo.assertCurrentActivity("WrongActivity", LonelyTwitterActivity.class);
//        solo.clickOnButton("Clear");
//        solo.enterText((EditText) solo.getView(R.id.body), "Test Tweet!");
//        solo.clickOnButton("Save");
//        solo.enterText((EditText) solo.getView(R.id.body), "");
//        solo.waitForText("Test Tweet!");
//        solo.clickInList(0);
//        solo.assertCurrentActivity("Wrong Activity", EditTweetActivity.class);

//    }

    public void testEditTweetList() throws Exception {
        // Create necessary text
        solo.assertCurrentActivity("WrongActivity", LonelyTwitterActivity.class);
        solo.enterText((EditText) solo.getView(R.id.body), "TestingTesting");
        solo.clickOnButton("Save");
        solo.enterText((EditText) solo.getView(R.id.body), "");
        solo.waitForText("TestingTesting");
        solo.clickInList(0);

        // Check for the testing text
        solo.assertCurrentActivity("WrongActivity", EditTweetActivity.class);
        TextView tv = (TextView) solo.getView(R.id.body);
        assertTrue(solo.waitForText("TestingTesting"));

        // Restore to original (must be no tweets)
        solo.clickOnButton("Return");
        solo.waitForText("Clear");
        solo.clickOnButton("Clear");
    }

    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

}