package sg.edu.rp.soi.p05_mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tvAndroidProg, tvIpadProg;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAndroidProg = findViewById(R.id.tv_androidProg);
        tvIpadProg = findViewById(R.id.tv_ipadProg);

        tvAndroidProg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getBaseContext(), AboutModuleActivity.class);
                intent.putExtra("Code", "C346");
                intent.putExtra("Name", "Android Programming");
                intent.putExtra("Year", "2018");
                intent.putExtra("Semester", "1");
                intent.putExtra("Credit", "4");
                intent.putExtra("Venue", "W66M");
                startActivity(intent);
            }
        });

        tvIpadProg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getBaseContext(), AboutModuleActivity.class);
                intent.putExtra("Code", "C349");
                intent.putExtra("Name", "iPad Programming");
                intent.putExtra("Year", "2019");
                intent.putExtra("Semester", "2");
                intent.putExtra("Credit", "199");
                intent.putExtra("Venue", "W23M");
                startActivity(intent);
            }
        });
    }
}
