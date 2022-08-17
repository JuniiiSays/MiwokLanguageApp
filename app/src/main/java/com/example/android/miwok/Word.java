package com.example.android.miwok;

import android.content.Context;
import android.view.View;

class Word extends View {

   //String Value for english word
   private String mDefaultWord;
   //String value for Miwok word
   private String mMiwokWord;
   //Context of the app
   private Context mContext;

   public Word(Context context) {
      super(context);
   }

}
