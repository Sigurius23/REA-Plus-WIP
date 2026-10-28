package com.mapbox.common;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/mapbox/common/RunloopErrorHandler;", "", "<init>", "()V", "", "error", "Ll83/a0;", "postErrorToMainLooper", "(Ljava/lang/Throwable;)V", "", "TAG", "Ljava/lang/String;", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
final class RunloopErrorHandler {
    public static final RunloopErrorHandler INSTANCE = new RunloopErrorHandler();
    public static final String TAG = "run_loop";

    private RunloopErrorHandler() {
    }

    @Keep
    public static final void postErrorToMainLooper(Throwable error) {
        AbstractC22676k.m65750j(error, "error");
        Log.error("Please check the following Java stacktrace for more information related to the exception: " + error.getMessage(), TAG);
        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new RunnableC5410a(error, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postErrorToMainLooper$lambda$0(Throwable error) throws Throwable {
        AbstractC22676k.m65750j(error, "$error");
        throw error;
    }
}
