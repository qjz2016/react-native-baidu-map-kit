package com.example.baidumap;

/**
 * Created by QJZ on 2016/6/2.
 */
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class BaiduMapModule extends ReactContextBaseJavaModule {
    public BaiduMapModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "BaiduMapModule";
    }
}
