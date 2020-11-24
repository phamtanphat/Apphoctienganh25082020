package com.example.apphoctienganh25082020.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;

import com.example.apphoctienganh25082020.R;
import com.example.apphoctienganh25082020.model.ApiResponse;
import com.example.apphoctienganh25082020.model.Word;
import com.example.apphoctienganh25082020.viewmodel.WordViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    WordViewModel mWordViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWordViewModel = ViewModelProviders.of(this).get(WordViewModel.class);

        // 1 : Fetch Words
        mWordViewModel.getResponseWords().observe(this, new Observer<ApiResponse<List<Word>>>() {
            @Override
            public void onChanged(ApiResponse<List<Word>> listApiResponse) {
                Log.d("BBB",listApiResponse.toString());
            }
        });

        mWordViewModel.fetchWords(1, 2);
    }
}