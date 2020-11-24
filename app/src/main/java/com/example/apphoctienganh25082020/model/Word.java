package com.example.apphoctienganh25082020.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Word {

    private String id;
    private String en;
    private String vn;
    private String ismemorized;

    /**
     * No args constructor for use in serialization
     */
    public Word() {
    }

    /**
     * @param ismemorized
     * @param vn
     * @param en
     * @param id
     */
    public Word(String id, String en, String vn, String ismemorized) {
        super();
        this.id = id;
        this.en = en;
        this.vn = vn;
        this.ismemorized = ismemorized;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getVn() {
        return vn;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }

    public String getIsmemorized() {
        return ismemorized;
    }

    public void setIsmemorized(String ismemorized) {
        this.ismemorized = ismemorized;
    }

}