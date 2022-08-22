package com.example.android.miwok;

class Word {

   //Default Translation for the word
   private String mDefaultTranslation;
   //Miwok Translation for the word
   private String mMiwokTranslation;
   //Image resource id
   private int mImageResourceId = NO_IMAGE_PROVIDED;
   //Audio Resource id
   private int mAudioResourceId;

   private static final int NO_IMAGE_PROVIDED = -1;

   public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
      mDefaultTranslation = defaultTranslation;
      mMiwokTranslation = miwokTranslation;
      mAudioResourceId = audioResourceId;
   }

   public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
      mDefaultTranslation = defaultTranslation;
      mMiwokTranslation = miwokTranslation;
      mImageResourceId = imageResourceId;
      mAudioResourceId = audioResourceId;
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

   public String getAudioResourceId(){
      return mAudioResourceId;
   }

   public boolean hasIamge(){
      return mImageResourceId != NO_IMAGE_PROVIDED;
   }


}
