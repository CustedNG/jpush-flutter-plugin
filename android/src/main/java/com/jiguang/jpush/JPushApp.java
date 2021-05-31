package com.jiguang.jpush;

import android.content.Intent;
import com.oasisfeng.condom.*;
import android.app.Application;

public class JPushApp extends Application {
    @Override
    public void onCreate() {
        CondomOptions options = new CondomOptions();
        options.setOutboundJudge(new CustomOutboundJudge());
        CondomProcess.installExcept(this, options); // install on all
    }

    public static class CustomOutboundJudge implements OutboundJudge {
        @Override
        public boolean shouldAllow(OutboundType type, Intent intent, String targetPackage) {
            return false;
        }
    }
}