package com.example.android.miwok;

/**
 * Created by lyman on 2017/5/17.
 */

public class Word {

    //Miwok translation
    private String mMiworkTranslation;

    //Default translation
    private String mDefaultTranslation;

    //Image Resource ID
    private int mImageResourceID;

    /*
    *Constructor_1 with only translations
     */
    public Word(String defaultTranslation, String miwokTranslation){
        mMiworkTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    /*
    *Constructor_2 with translations and images
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID){
        mMiworkTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceID = imageResourceID;
    }

    /*
    *Get the Miwok translation of a word
     */
    public String getMiwokTranslation(){
        return mMiworkTranslation;
    }

    /*
    *Get the Default translation of a word
     */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    //Get the image resource ID
    public int getImageResourceID(){return mImageResourceID;}
}
