package com.mymiwok.mymiwok;

/**
 * Created by SaherOs on 8/31/2017.
 */

public class Word {

    private String mDefaultTranslation ;
    private String mMiwokTranslation ;
    private int    mImageID = notValidImage ;
    private static final int  notValidImage = -1 ;
    public Word(){

    }

    public Word(String DefaultTranslation , String MiwokTranslation){

        mDefaultTranslation = DefaultTranslation ;
        mMiwokTranslation = MiwokTranslation ;
    }

    public Word(String DefaultTranslation , String MiwokTranslation , int ImageID){

        mDefaultTranslation = DefaultTranslation ;
        mMiwokTranslation = MiwokTranslation ;
        mImageID = ImageID ;
    }

    public  String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageID() {
        return mImageID;
    }

    public boolean hasImage(){
        return mImageID != notValidImage ;
    }
}
