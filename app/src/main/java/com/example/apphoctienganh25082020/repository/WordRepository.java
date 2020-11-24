package com.example.apphoctienganh25082020.repository;

import com.example.apphoctienganh25082020.api.ApiRequest;
import com.example.apphoctienganh25082020.api.RetrofitInit;
import com.example.apphoctienganh25082020.model.ApiResponse;

import io.reactivex.rxjava3.core.Maybe;

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

    public Maybe<ApiResponse>
}
