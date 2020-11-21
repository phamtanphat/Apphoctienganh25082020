package com.example.apphoctienganh25082020.repository;

import com.example.apphoctienganh25082020.api.ApiRequest;
import com.example.apphoctienganh25082020.api.RetrofitInit;

public class WordRepository {
    private static WordRepository mInstance = null;
    private ApiRequest mApiRequest = null;
    private WordRepository(){
        mApiRequest = RetrofitInit.getInstance();
    }
    public static WordRepository getInstance(){
        if (mInstance == null){
            mInstance = new WordRepository();
        }
        return mInstance;
    }
}
