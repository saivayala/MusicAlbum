package com.example.nagas.musicalbum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.recycler);

        int images[]= {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j};
        String movieNames[]={"A AA","Bahubali","Cheliya","Dhruva","EPCV","Fidda","Gabbar","Hello","Indhra","Janatha Garage"};

        AlbumAdapter adapter=new AlbumAdapter(this,images,movieNames);

        rv.setAdapter(adapter);

        rv.setLayoutManager(new LinearLayoutManager(this));

    }
}
