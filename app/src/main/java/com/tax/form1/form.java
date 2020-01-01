package com.tax.form1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class form extends AppCompatActivity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {
    TextView tv;
    String[] userInputs = new String[5];
    RadioButton[] rbA = new RadioButton[5];
    RadioGroup radioGroup;
    String ans;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        setUp();
        getQAO();


    }

    private void getQAO() {
        Intent i = new Intent();
        Bundle qAO = i.getExtras();
//        userInputs = qAO.getStringArray("qAO");
//        tv.setText(userInputs[0]);

//        for (int i = 0; i < (userInputs.length) - 1; i++) {
//            rbA[i].setText(userInputs[i + 1]);
//        }

    send.setOnClickListener(this);
    }


    private void setUp() {
        rbA[0] = findViewById(R.id.rb1);
        rbA[1] = findViewById(R.id.rb2);
        rbA[2] = findViewById(R.id.rb3);
        rbA[3] = findViewById(R.id.rb4);
        tv = findViewById(R.id.textView);
        send = findViewById(R.id.send);
        radioGroup = findViewById(R.id.rg);
    }

    @Override
    public void onClick(View v) {
        // TODO: 01-01-2020 send item
        Toast.makeText(this,ans,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.rb1:
                ans = userInputs[1];
                break;
            case R.id.rb2:
                ans = userInputs[2];
                break;
            case R.id.rb3:
                ans = userInputs[3];
                break;
            case R.id.rb4:
                ans = userInputs[4];
                break;
            default:
                Toast.makeText(getApplicationContext(),"error",Toast.LENGTH_SHORT).show();
        }


    }
}

