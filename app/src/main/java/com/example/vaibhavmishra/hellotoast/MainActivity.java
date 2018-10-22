package com.example.vaibhavmishra.hellotoast;

import java.lang.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.view.View;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void countUp(View v)
    {
        TextView tv=(TextView)findViewById(R.id.show_count);
        if(v!=null)
        {
            count=(count+1)%1000;
            tv.setText(Integer.toString(count));
        }
    }

    public void showToast(View v)
    {
        Context con=getApplicationContext();
        int dur=Toast.LENGTH_SHORT;
        Toast.makeText(con,R.string.message,dur).show();
    }
}
