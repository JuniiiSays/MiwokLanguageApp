package com.example.android.miwok;

class Word {

   //Default Translation for the word
   private String mDefaultTranslation;
   //Miwok Translation for the word
   private String mMiwokTranslation;
   //Image resource id
   private int mImageResourceId = NO_IMAGE_PROVIDED;

   private static final int NO_IMAGE_PROVIDED = -1;

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

   public boolean hasIamge(){
      return mImageResourceId != NO_IMAGE_PROVIDED;
   }


}
