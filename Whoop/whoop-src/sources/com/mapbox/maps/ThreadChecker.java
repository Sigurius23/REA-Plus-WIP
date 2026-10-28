package com.mapbox.maps;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import com.mapbox.common.MapboxSDKCommon;
import com.mapbox.maps.exception.WorkerThreadException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, m65681d2 = {"Lcom/mapbox/maps/ThreadChecker;", "", "<init>", "()V", "", "resolveEnabledState", "()Z", "resolveDebugState", "isMainThread", "Ll83/a0;", "throwIfNotMainThread", "enabled", "Z", "debug", "", "TAG", "Ljava/lang/String;", "DEBUG_FIELD", "METADATA_KEY", "DEBUG_LOOKUP_FAILED", "METADATA_LOOKUP_FAILED", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class ThreadChecker {
    private static final String DEBUG_FIELD = "DEBUG";
    private static final String DEBUG_LOOKUP_FAILED = "Unable to lookup build config of application.";
    public static final ThreadChecker INSTANCE;
    private static final String METADATA_KEY = "com.mapbox.maps.ThreadChecker";
    private static final String METADATA_LOOKUP_FAILED = "No boolean metadata found for key com.mapbox.maps.ThreadChecker";
    private static final String TAG = "ThreadChecker";
    private static final boolean debug;
    private static final boolean enabled;

    static {
        ThreadChecker threadChecker = new ThreadChecker();
        INSTANCE = threadChecker;
        enabled = threadChecker.resolveEnabledState();
        debug = threadChecker.resolveDebugState();
    }

    private ThreadChecker() {
    }

    private final boolean isMainThread() {
        return AbstractC22676k.m65745e(Thread.currentThread(), Looper.getMainLooper().getThread());
    }

    private final boolean resolveDebugState() {
        try {
            return Class.forName(MapboxSDKCommon.INSTANCE.getContext().getApplicationInfo().packageName + ".BuildConfig").getField(DEBUG_FIELD).getBoolean(null);
        } catch (Exception e5) {
            MapboxLogger.logI(TAG, "Unable to lookup build config of application. " + e5.getLocalizedMessage());
            return false;
        }
    }

    private final boolean resolveEnabledState() {
        try {
            Context context = MapboxSDKCommon.INSTANCE.getContext();
            PackageManager packageManager = context.getPackageManager();
            AbstractC22676k.m65749i(packageManager, "context.packageManager");
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
            AbstractC22676k.m65749i(applicationInfo, "packageManager.getApplic…ger.GET_META_DATA\n      )");
            Bundle bundle = applicationInfo.metaData;
            if (bundle.containsKey(METADATA_KEY)) {
                return bundle.getBoolean(METADATA_KEY);
            }
            return true;
        } catch (Exception e5) {
            MapboxLogger.logI(TAG, "No boolean metadata found for key com.mapbox.maps.ThreadChecker " + e5.getLocalizedMessage());
            return true;
        }
    }

    public final void throwIfNotMainThread() {
        if ((!(!enabled) && !(!debug)) && !isMainThread()) {
            throw new WorkerThreadException();
        }
    }
}
