package com.example.apphoctienganh25082020.api;

import com.example.apphoctienganh25082020.model.ApiResponse;
import com.example.apphoctienganh25082020.model.Word;

import java.util.List;

import io.reactivex.rxjava3.core.Maybe;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiRequest {
    @GET("apituvung2508/word.php")
    Maybe<ApiResponse<List<Word>>> getWord(
                @Query("page") Integer page ,
                @Query("numitems") Integer numitems
            );
}
