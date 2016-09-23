package ch.epfl.sweng.swenghomeworkone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static ch.epfl.sweng.swenghomeworkone.MainActivity.USER_NAME;

public class GreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        Intent intent = getIntent();
        String greetingMessage = getApplication().getString(R.string.greeting_message);
        greetingMessage = greetingMessage.substring(0, greetingMessage.length()-1)
                + intent.getStringExtra(USER_NAME)
                + greetingMessage.substring(greetingMessage.length()-1);

        TextView greetingTextView = (TextView) findViewById(R.id.greetingMessage);
        greetingTextView.setText(greetingMessage);
    }
}
