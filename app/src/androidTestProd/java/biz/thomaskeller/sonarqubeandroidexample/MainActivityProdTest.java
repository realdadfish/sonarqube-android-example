package biz.thomaskeller.sonarqubeandroidexample;

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
import static org.hamcrest.core.StringStartsWith.startsWith;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityProdTest {

    @Rule
    public ActivityTestRule<MainActivity> mIntentsActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testButtonLabel() throws Exception {
        onView(withId(R.id.say_my_name)).perform(click());

        onView(withId(R.id.my_name)).check(matches(withText(startsWith("prod variant says: "))));
    }
}
