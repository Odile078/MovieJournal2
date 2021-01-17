 package com.example.mvstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;

import butterknife.BindView;

 public class SearchResultsActivity extends AppCompatActivity {
     @BindView(R.id.EditTextSearch)
     EditText EditTextSearch;
     @BindView(R.id.imageButton)
     ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);
    }
}