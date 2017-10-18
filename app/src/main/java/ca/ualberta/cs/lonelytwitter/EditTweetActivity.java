package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    TextView display;
    Button returnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        display = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        display.setText(intent.getStringExtra("TweetMessage"));
        intent.removeExtra("TweetMessage");

        returnButton = (Button) findViewById(R.id.Return);

        returnButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(EditTweetActivity.this, LonelyTwitterActivity.class);
                startActivity(intent);
            }
        });
    }


}
