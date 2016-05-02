package com.example.ykai.adapterstudy;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;


public class MainActivity extends Activity {

    private ListView mListView;
    private MyAdapter mAdapter;
    private List<String> mDatas = Arrays.asList("Hello", "Java", "Android");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.id_listview);
        mAdapter = new MyAdapter(this, mDatas);
        mListView.setAdapter(mAdapter);


    }

}
