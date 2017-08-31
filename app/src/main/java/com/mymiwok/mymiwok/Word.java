package com.mymiwok.mymiwok;

/**
 * Created by SaherOs on 8/31/2017.
 */

public class Word {

    private String mDefaultTranslation ;
    private String mMiwokTranslation ;


    public Word(){

    }

    public Word(String DefaultTranslation , String MiwokTranslation){

        mDefaultTranslation = DefaultTranslation ;
        mMiwokTranslation = MiwokTranslation ;
    }

    public  String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
