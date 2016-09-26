package com.example.resalat.sharedpreferrences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed1, edt2, edt3;
    Button b1;
    public static final String MyPreferences = "com.example.resalat.myprefs";
    public static final String Name = "com.example.resalat.name";
    public static final String Phone = "com.example.resalat.phone";
    public static final String Email = "com.example.resalat.email";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = (EditText) findViewById(R.id.NameEdit);
        edt2 = (EditText) findViewById(R.id.PhoneEdit);
        edt3 = (EditText) findViewById(R.id.EmailEdit);
        b1 = (Button) findViewById(R.id.Submit);

        final SharedPreferences sharedPreferences = getSharedPreferences(MyPreferences, Context.MODE_PRIVATE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1 = ed1.getText().toString();
                String s2 = edt2.getText().toString();
                String s3 = edt3.getText().toString();

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("Name", "s1");
                editor.putString("Phone", "s2");
                editor.putString("Email", "s3");
                editor.commit();
                Toast.makeText(MainActivity.this, "Thanks", Toast.LENGTH_LONG).show();


            }
        });
    }
}
