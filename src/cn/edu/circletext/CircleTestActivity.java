package cn.edu.circletext;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CircleTestActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_test);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_circle_test, menu);
        return true;
    }
}
