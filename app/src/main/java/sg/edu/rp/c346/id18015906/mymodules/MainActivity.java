package sg.edu.rp.c346.id18015906.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView android;
    TextView iPad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android = findViewById(R.id.textView);
        iPad = findViewById(R.id.textView2);

        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("value", "Android Programming");
                intent.putExtra("code", "C346");
                startActivity(intent);

            }
        });

        iPad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("value", "iPad Programming");
                intent.putExtra("code", "C349");
                startActivity(intent);

            }
        });
    }
}
