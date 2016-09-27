package biz.thomaskeller.sonarqubeandroidexample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class NameManagerInternalTest {
    private NameManager mNameManager = new NameManager();

    @Test
    public void stuffIsCorrect() throws Exception {
        assertEquals("internal variant says: Thats my name, I like it!", mNameManager.getRealName());
    }
}