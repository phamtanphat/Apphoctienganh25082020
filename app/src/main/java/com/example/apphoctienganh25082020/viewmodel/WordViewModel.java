package com.example.apphoctienganh25082020.viewmodel;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.apphoctienganh25082020.model.ApiResponse;
import com.example.apphoctienganh25082020.model.Word;
import com.example.apphoctienganh25082020.repository.WordRepository;

import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class WordViewModel extends ViewModel {
    private WordRepository mWordRepository;
    private MutableLiveData<ApiResponse<List<Word>>> mWords;

    public WordViewModel() {
        mWords = new MutableLiveData<>();
        mWordRepository = WordRepository.getInstance();
    }

    public void fetchWords(Integer page , Integer numitems){
        mWordRepository.getWords(page , numitems)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MaybeObserver<ApiResponse<List<Word>>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onSuccess(@NonNull ApiResponse<List<Word>> listApiResponse) {
                        mWords.setValue(listApiResponse);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        Log.d("BBB",e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public LiveData<ApiResponse<List<Word>>> getResponseWords(){
        return mWords;
    }
}
