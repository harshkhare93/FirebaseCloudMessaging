package harsh.firebasecloudmessaging;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by ngamacmini17 on 23/08/17.
 */

public class ResultActivity extends Activity {


    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tvText);
        textView.setText("Welcome to the Result Activity");
    }
}
