package ch.epfl.sweng.swenghomeworkone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String USER_NAME = "ch.epfl.sweng.swenghomeworkone.NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the user click on the go Button
     * @param view
     */
    public void greetUser(View view) {
        Intent greetingIntent = new Intent(this, GreetingActivity.class);
        EditText userNameEditText = (EditText) findViewById(R.id.mainUserName);
        String userNameString = userNameEditText.getText().toString();

        greetingIntent.putExtra(USER_NAME, userNameString);
        startActivity(greetingIntent);
    }
}
