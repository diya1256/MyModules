package sg.edu.rp.c346.id22000028.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondProject extends AppCompatActivity {
    //Step 1
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_project);

        //Step 2
        tvAnswer = findViewById(R.id.textView2);
        Intent intentReceived = getIntent();

        tvAnswer.setText("Module Code: C346 \n Module Name: Android Programming \n Academic Year:2020 \n Semester: 1 \n Module Credit: 4 \n Venue: W66M " );

    }
}