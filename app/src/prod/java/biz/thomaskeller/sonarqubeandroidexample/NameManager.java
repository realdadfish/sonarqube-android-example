package biz.thomaskeller.sonarqubeandroidexample;

import biz.thomaskeller.mylibrary.NameProvider;

/**
 * Created by thomas on 27.09.16.
 */

public class NameManager {
    private NameProvider mNameProvider = new NameProvider();

    public String getRealName() {
        return "prod variant says: " + mNameProvider.getName();
    }
}
