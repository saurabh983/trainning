package woogly.unyde.org.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView onetxt, twotxt,threetxt,fourtxt;
    Button submitbtn;
    int change = 0;

    EditText edttxt,edttxttwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onetxt = findViewById(R.id.onetxt);
        submitbtn = findViewById(R.id.submitbtn);
        edttxt = findViewById(R.id.edttxt);
        edttxttwo = findViewById(R.id.edttxttwo);

        onetxt.setText("Hi world");

        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                if (change == 0){
//                    onetxt.setText("One click");
//                    onetxt.setBackgroundResource(R.color.green);
//                    onetxt.setTextColor(getResources().getColor(R.color.white));
//                    change = 1;
//                }
//                else
//                if (change == 1){
//                    onetxt.setBackgroundResource(R.color.red);
//                    onetxt.setText("two click");
//                    change = 2;
//
//                }
//                else
//                if (change == 2){
//                    onetxt.setText("three click");
//                    onetxt.setBackgroundResource(R.color.black);
//                    change = 3;
//
//                }
//                else  if (change == 3){
//                    onetxt.setText("four click");
//                    onetxt.setBackgroundResource(R.color.yellow);
//                    change = 0;
//                }

//                onetxt.setText(edttxt.getText().toString());

//                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
//                intent.putExtra("data",edttxt.getText().toString());
//                startActivity(intent);

                String numberone = edttxt.getText().toString();
                String numbertwo = edttxttwo.getText().toString();

                int sum = Integer.parseInt(numberone) + Integer.parseInt(numbertwo);

                onetxt.setText(String.valueOf(sum));
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("data",String.valueOf(sum));
                startActivity(intent);
            }
        });


        onetxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,"Hello ji",Toast.LENGTH_LONG).show();

            }
        });
//
//ctrl+/
        edttxttwo.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                onetxt.setText(s.toString());

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
    public void submittxt(){
        onetxt.setText("Hi click");
    }
}
