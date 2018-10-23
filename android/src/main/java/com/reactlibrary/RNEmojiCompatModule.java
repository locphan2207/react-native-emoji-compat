
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import android.support.text.emoji.EmojiCompat;
import android.R;

public class RNEmojiCompatModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNEmojiCompatModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNEmojiCompat";
  }

  @ReactMethod
  public void getProcessedEmojiString(String inputString, Callback successCallback, Callback errorCallback) {
    try {
      CharSequence processed = EmojiCompat.get().process(inputString);
      successCallback.invoke(processed);
    } catch(Error error) {
      errorCallback.invoke("EmojiCompat: Cannot process emoji string");
    }
  }
}
