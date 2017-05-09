package com.app.fernaliahalim.movlife;

/**
 * Created by Ferna on 29/11/2016.
 */

public class DataObject {
    private int drawable;
    private String title;
    private String rated;
    private String director;
    private String writers;
    private String desc;

    DataObject (int text1, String text2, String rated){
        drawable = text1;
        title = text2;
        this.rated = rated;
    }

    public int getmText1() {
        return drawable;
    }

    public void setmText1(int mText1) {
        this.drawable = mText1;
    }

    public String getmText2() {
        return title;
    }

    public void setmText2(String mText2) {
        this.title = mText2;
    }

    public String getRated(){
        return rated;
    }

    public void setRated(String rated){
        this.rated = rated;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getWriters() {
        return writers;
    }

    public void setWriters(String writers) {
        this.writers = writers;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}