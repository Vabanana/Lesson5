package sg.edu.rp.c346.id18015906.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView code;
    TextView name;
    TextView year;
    TextView sem;
    TextView credit;
    TextView venue;
    Button returns;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        code = findViewById(R.id.textViewCode);
        name = findViewById(R.id.textViewName);
        year = findViewById(R.id.textViewYear);
        sem = findViewById(R.id.textViewSemester);
        credit = findViewById(R.id.textViewVenue);


        Intent intentReceived = getIntent();
        String value = intentReceived.getStringExtra("value");
        String codet = intentReceived.getStringExtra("code");


        code.setText(R.string.module_code + codet);
        name.setText(R.string.module_name + value);
        year.setText(R.string.academic_year + 2020);
        sem.setText(R.string.semester + 1 );
        credit.setText(R.string.module_credit + 4);
        venue.setText(R.string.venue + "W66M");



        returns = findViewById(R.id.buttonReturn);
        returns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
            }
        });




    }
}
