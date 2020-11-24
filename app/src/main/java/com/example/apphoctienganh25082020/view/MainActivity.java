package com.example.apphoctienganh25082020.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;

import com.example.apphoctienganh25082020.R;
import com.example.apphoctienganh25082020.enums.MemorizedEnum;
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
//        mWordViewModel.getResponseWords().observe(this, new Observer<ApiResponse<List<Word>>>() {
//            @Override
//            public void onChanged(ApiResponse<List<Word>> listApiResponse) {
//                Log.d("BBB",listApiResponse.getData().get(0).getIsmemorized());
//            }
//        });
//
//        mWordViewModel.fetchWords(1, 2);

        // 2 : Insert word

//        mWordViewModel.getDataWordInsert().observe(this, new Observer<ApiResponse<List<Word>>>() {
//            @Override
//            public void onChanged(ApiResponse<List<Word>> listApiResponse) {
//                Log.d("BBB",listApiResponse.getData().get(0).getIsmemorized());
//            }
//        });
//
//        mWordViewModel.insertWord("Four","Bốn", MemorizedEnum.FORGOT);

        // 3 : Toggle Word
//        mWordViewModel.getWordMemorized().observe(this, new Observer<ApiResponse<List<Word>>>() {
//            @Override
//            public void onChanged(ApiResponse<List<Word>> listApiResponse) {
//                Log.d("BBB",listApiResponse.toString());
//            }
//        });
//
//        mWordViewModel.toggleWord(5,MemorizedEnum.MEMORIZED);
        // 4 : Delete Word
        mWordViewModel.getWordDeleted().observe(this, new Observer<ApiResponse<List<Word>>>() {
            @Override
            public void onChanged(ApiResponse<List<Word>> listApiResponse) {
                Log.d("BBB",listApiResponse.toString());
            }
        });
        mWordViewModel.deleteWord(4);
    }
}