package com.mymiwok.mymiwok;

/**
 * Created by SaherOs on 8/31/2017.
 */

public class Word {

    private String mDefaultTranslation ;
    private String mMiwokTranslation ;
    private int    mImageID = notValidImage ;
    private int    mAudioID ;
    private static final int  notValidImage = -1 ;

    public Word(){

    }

    public Word(String DefaultTranslation , String MiwokTranslation , int AudioID){

        mDefaultTranslation = DefaultTranslation ;
        mMiwokTranslation = MiwokTranslation ;
        mAudioID = AudioID ;
    }

    public Word(String DefaultTranslation , String MiwokTranslation , int ImageID , int AudioID){

        mDefaultTranslation = DefaultTranslation ;
        mMiwokTranslation = MiwokTranslation ;
        mImageID = ImageID ;
        mAudioID = AudioID ;
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

    public int getAudioID() {
        return mAudioID;
    }

    public void setAudioID(int mAudioID) {
        this.mAudioID = mAudioID;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageID=" + mImageID +
                ", mAudioID=" + mAudioID +
                '}';
    }
}
