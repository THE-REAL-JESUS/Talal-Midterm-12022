package com.example.talal_midterm_12022;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity4 extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main4);
        String[] attractions= {"WEB", "Picture"};
        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_main4,R.id.travel,attractions));
        final Button mainButton2 = (Button) findViewById(R.id.mainButton2);

        mainButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity4.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch(position){
            case 0:startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://alfaisal.edu")));break;
            case 1: startActivity(new Intent(MainActivity4.this,MainActivity5.class));
        }
    }
}