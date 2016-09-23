package ch.epfl.sweng.swenghomeworkone;

import android.support.test.InstrumentationRegistry;
import android.test.ActivityInstrumentationTestCase2;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Class that test the UI of the MainActivity
 */

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        injectInstrumentation(InstrumentationRegistry.getInstrumentation());
    }

    public void testCanGreetUsers() {
        getActivity();
        onView(withId(R.id.mainUserName)).perform(typeText("from my unit test"));
        onView(withId(R.id.mainGoButton)).perform(click());
        onView(withId(R.id.greetingMessage)).check(matches(withText("Hello from my unit test!")));
    }

    public void testAnonymousUser() {
        getActivity();
        onView(withId(R.id.mainGoButton)).perform(click());
        onView(withId(R.id.greetingMessage)).check(matches(withText("Hello Anonymous!")));
    }
}
