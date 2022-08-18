package com.example.android.miwok;

class Word {

   //Default Translation for the word
   private String mDefaultTranslation;
   //Miwok Translation for the word
   private String mMiwokTranslation;
   //Image resource id
   private int mImageResourceId;

   public Word(String defaultTranslation, String miwokTranslation) {
      mDefaultTranslation = defaultTranslation;
      mMiwokTranslation = miwokTranslation;
   }

   public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
      mDefaultTranslation = defaultTranslation;
      mMiwokTranslation = miwokTranslation;
      mImageResourceId = imageResourceId;
   }

   public int getmImageResourceId() {
      return mImageResourceId;
   }

   public String getMiwokTranslation() {
      return mMiwokTranslation;
   }

   public String getDefaultTranslation() {
      return mDefaultTranslation;
   }


}
