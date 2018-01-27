package com.example.rakesh.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    CheckBox cbpython,cbcpp,cbswift,cbjava;
    TextView tvresult;
    ArrayList<String> language;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbjava = (CheckBox)findViewById(R.id.cbjava);
        cbcpp = (CheckBox)findViewById(R.id.cbcpp);
        cbswift = (CheckBox)findViewById(R.id.cbswift);
        cbpython = (CheckBox)findViewById(R.id.cbpython);
        tvresult = (TextView)findViewById(R.id.tvresult);

        language = new ArrayList<>();
    }

    public void process(View view) {
        tvresult.setText("");
        if (cbcpp.isChecked()){
            language.add("C++");
        }
        else
            language.remove("C++");
        if (cbswift.isChecked()){
           language.add("Swift");
        }
        else
            language.remove("Swift");
        if (cbpython.isChecked()){
            language.add("Python");
            }
            else
                language.remove("Python");
        if (cbjava.isChecked()){
            language.add("Java");
        }
        else
            language.remove("Java");
        for (String language: language)
        {
            tvresult.append(language+ "  ");
        }

        language.clear();
   }
}
