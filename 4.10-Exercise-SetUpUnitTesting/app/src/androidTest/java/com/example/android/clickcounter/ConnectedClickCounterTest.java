package com.example.android.clickcounter;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by feder on 27/04/2018.
 */

@RunWith(AndroidJUnit4.class)
public class ConnectedClickCounterTest {
    @Rule public ActivityTestRule<ClickActivity> activityTestRule = new ActivityTestRule<ClickActivity>(ClickActivity.class);

    @Test
    public void CheckIfCLickOnIncrementButtonIncreaseTheCounterInsideTextView(){
        onView(withId(R.id.click_count_text_view)).check(matches(withText("0")));
        onView(withId(R.id.click_button)).perform(click());
        onView(withId(R.id.click_count_text_view)).check(matches(withText("1")));
    }
}
