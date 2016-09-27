package biz.thomaskeller.sonarqubeandroidexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private NameManager mNameManager = new NameManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.say_my_name).setOnClickListener((view) ->
                ((TextView) findViewById(R.id.my_name)).setText(mNameManager.getRealName()));
    }
}
