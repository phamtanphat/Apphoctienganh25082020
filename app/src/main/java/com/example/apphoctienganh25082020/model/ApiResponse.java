package com.example.apphoctienganh25082020.model;

import java.util.List;

public class ApiResponse<T> {
    private Integer totalpage;
    private String currentpage;
    private Boolean success;
    private String message;
    private T data = null;

    public ApiResponse() {
    }

    public ApiResponse(Integer totalpage, String currentpage, Boolean success, String message, T data) {
        super();
        this.totalpage = totalpage;
        this.currentpage = currentpage;
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public Integer getTotalpage() {
        return totalpage;
    }

    public void setTotalpage(Integer totalpage) {
        this.totalpage = totalpage;
    }

    public String getCurrentpage() {
        return currentpage;
    }

    public void setCurrentpage(String currentpage) {
        this.currentpage = currentpage;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
