package com.example.apphoctienganh25082020.repository;

import com.example.apphoctienganh25082020.api.ApiRequest;
import com.example.apphoctienganh25082020.api.RetrofitInit;
import com.example.apphoctienganh25082020.enums.MemorizedEnum;
import com.example.apphoctienganh25082020.model.ApiResponse;
import com.example.apphoctienganh25082020.model.Word;

import java.util.List;

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

    public Maybe<ApiResponse<List<Word>>> getWords(Integer page, Integer numitems){
        return  mApiRequest.getWord(page,numitems);
    }

    public Maybe<ApiResponse<List<Word>>> insertWord(String en , String vn , MemorizedEnum memorizedEnum){
        return  mApiRequest.insertWord(en,vn, memorizedEnum.getValue());
    }

    public Maybe<ApiResponse<List<Word>>> toggleWord(Integer id, MemorizedEnum memorizedEnum){
        return  mApiRequest.toggleWord(id, memorizedEnum.getValue());
    }

    public Maybe<ApiResponse<List<Word>>> deleteWord(Integer id){
        return  mApiRequest.deleteWord(id);
    }
}
