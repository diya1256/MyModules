package sg.edu.rp.c346.id22000028.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdProject extends AppCompatActivity {
    TextView tvAnswer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_project);
        //Step 2
        tvAnswer2 = findViewById(R.id.textView3);
        Intent intentReceived = getIntent();

        tvAnswer2.setText("Module Code: C349 \n Module Name: iPad Programming \n Academic Year:2020 \n Semester: 1 \n Module Credit: 4 \n Venue: W64N " );

    }
}