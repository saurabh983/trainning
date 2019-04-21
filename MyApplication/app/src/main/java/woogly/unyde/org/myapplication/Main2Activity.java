package woogly.unyde.org.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
TextView gettext;
String changethedata= "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        gettext = findViewById(R.id.gettext);

        changethedata = getIntent().getStringExtra("data");

        gettext.setText(changethedata);
    }
}
