package com.jiguang.jpush;

import com.oasisfeng.condom.CondomProcess;
import android.app.Application;

public class JPushApp extends Application {
    @Override public void onCreate() {
      CondomProcess.installExceptDefaultProcess(this);
    }
}