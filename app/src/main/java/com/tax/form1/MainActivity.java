package com.tax.form1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
EditText[] et = new EditText[5];
int index=0;
String[] etS = new String[5];

Button bSend;
Button bShare; //not intiallized
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUp();
        bSend.setOnClickListener(this);

    }

    private void setUp() {
        //intialize

        linearLayout = findViewById(R.id.linearLayout);
        for( int i=0; i <linearLayout.getChildCount();i++ ){
            View v = linearLayout.getChildAt(i);
            if (v instanceof EditText){
                et[index++] = (EditText) v;
            }
        }


        bSend = findViewById(R.id.bSend);
         //try another way
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bSend :
                for (int i=0 ;i<et.length;i++){
                    etS[i]=et[i].getText().toString();
                }
                 if ( !(etS[0].length()==0) && ! (etS[1].length()==0) && ! (etS[2].length()==0)&&  !(etS[3].length()==0) && ! (etS[4].length()==0))
                 {

                     Bundle extra = new Bundle();
                     extra.putStringArray("qAO",etS);// FIXME: 01-01-2020 KEY
                     Intent i = new Intent(MainActivity.this,form.class);
                     i.putExtra("bundle",extra);
                     Toast.makeText(getApplicationContext(),"Creating your Question...",Toast.LENGTH_SHORT).show();
                     startActivity(i);
                     // TODO: 01-01-2020 want to stop this Activity

                 }
                else {
                     Toast.makeText(MainActivity.this,"please enter all required text",Toast.LENGTH_LONG).show();
                 }

                break;
            case  R.id.bShare :
                break;
        }

    }
}
