package sg.edu.rp.c346.id22000028.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Event handling Step 1
    TextView btnPassInteger;
    TextView btnPassInteger2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Event handling Step 2
        btnPassInteger = findViewById(R.id.TextView1);

        // Event handling Step 3
        btnPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondProject.class);
                intent.putExtra("value", 1);
                startActivity(intent);
            }
        });

        // Event handling Step 2
        btnPassInteger2 = findViewById(R.id.TextView2);

        // Event handling Step 3
        btnPassInteger2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ThirdProject.class);
                intent.putExtra("value", 1);
                startActivity(intent);
            }
        });

    }
}
