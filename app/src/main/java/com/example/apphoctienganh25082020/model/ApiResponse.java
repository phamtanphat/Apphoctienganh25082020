package com.example.apphoctienganh25082020.model;

public class ApiResponse {
    private Integer totalpage;
    private String currentpage;
    private Boolean success;
    private Object message;
    private List<Datum> data = null;

    public ApiResponse() {
    }

    public ApiResponse(Integer totalpage, String currentpage, Boolean success, Object message, List<Datum> data) {
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

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }
}
