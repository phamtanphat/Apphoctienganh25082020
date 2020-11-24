package com.example.apphoctienganh25082020.viewmodel;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.apphoctienganh25082020.enums.MemorizedEnum;
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
    private MutableLiveData<ApiResponse<List<Word>>> mWordInsert;
    private MutableLiveData<ApiResponse<List<Word>>> mWordMemorized;
    private MutableLiveData<ApiResponse<List<Word>>> mWordDelete;

    public WordViewModel() {
        mWords = new MutableLiveData<>();
        mWordInsert = new MutableLiveData<>();
        mWordMemorized = new MutableLiveData<>();
        mWordDelete = new MutableLiveData<>();
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

    public void insertWord(String en , String vn , MemorizedEnum memorizedEnum){
        mWordRepository.insertWord(en , vn , memorizedEnum)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MaybeObserver<ApiResponse<List<Word>>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onSuccess(@NonNull ApiResponse<List<Word>> listApiResponse) {
                        mWordInsert.setValue(listApiResponse);
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

    public LiveData<ApiResponse<List<Word>>> getDataWordInsert(){
        return mWordInsert;
    }

    public void toggleWord(Integer id , MemorizedEnum memorizedEnum){
        mWordRepository.toggleWord(id , memorizedEnum)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MaybeObserver<ApiResponse<List<Word>>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onSuccess(@NonNull ApiResponse<List<Word>> listApiResponse) {
                        mWordMemorized.setValue(listApiResponse);
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
    public LiveData<ApiResponse<List<Word>>> getWordMemorized(){
        return mWordMemorized;
    }
    public void deleteWord(Integer id ){
        mWordRepository.deleteWord(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MaybeObserver<ApiResponse<List<Word>>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onSuccess(@NonNull ApiResponse<List<Word>> listApiResponse) {
                        mWordDelete.setValue(listApiResponse);
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
    public LiveData<ApiResponse<List<Word>>> getWordDeleted(){
        return mWordDelete;
    }
}
