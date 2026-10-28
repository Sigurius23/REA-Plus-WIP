package com.mapbox.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.os.SystemClock;
import java.io.File;
import l83.C23467m;
import m83.AbstractC25260n;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u0010\u0010\b\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\nH\u0002¨\u0006\u000b"}, m65681d2 = {"gatherSystemInfo", "", "initializerData", "Lcom/mapbox/common/InitializerData;", "context", "Landroid/content/Context;", "t", "", "skipFurtherInitialization", "", "Ljava/lang/Class;", "common_release"}, m65682k = 2, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class BaseMapboxInitializerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String gatherSystemInfo(InitializerData initializerData, Context context, Throwable th3) {
        Object objM107888l;
        Object objM107888l2;
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            objM107888l = packageManager != null ? Boolean.valueOf(packageManager.isInstantApp()) : null;
        } catch (Throwable th4) {
            objM107888l = AbstractC34132o.m107888l(th4);
        }
        Object obj = objM107888l;
        try {
            PackageManager packageManager2 = context.getPackageManager();
            if (packageManager2 == null || (applicationInfo = packageManager2.getApplicationInfo(context.getPackageName(), 0)) == null) {
                objM107888l2 = null;
            } else {
                String[] list = new File(applicationInfo.nativeLibraryDir).list();
                if (list == null || (objM107888l2 = AbstractC25260n.m74028D0(list, null, null, null, null, 63)) == null) {
                    objM107888l2 = "";
                }
            }
        } catch (Throwable th5) {
            objM107888l2 = AbstractC34132o.m107888l(th5);
        }
        StringBuilder sb4 = new StringBuilder("Failed to initialize: Attempt=");
        sb4.append(initializerData.getCurrentInitAttempt());
        sb4.append(", exception=[");
        sb4.append(th3.getClass().getSimpleName());
        sb4.append("], initializer called ");
        sb4.append(SystemClock.elapsedRealtime() - initializerData.getFirstInitElapsedTimeMs());
        sb4.append(" ms ago, exception.message=[");
        sb4.append(th3.getMessage());
        sb4.append("], exception.cause=[");
        Throwable cause = th3.getCause();
        sb4.append(cause != null ? cause.getClass().getSimpleName() : null);
        sb4.append("], exception.cause.message=[");
        Throwable cause2 = th3.getCause();
        sb4.append(cause2 != null ? cause2.getMessage() : null);
        sb4.append("], extractedNativeLibs=[");
        if (objM107888l2 instanceof C23467m) {
            objM107888l2 = null;
        }
        sb4.append((String) objM107888l2);
        sb4.append("], isInstantApp=[");
        sb4.append(obj instanceof C23467m ? null : obj);
        sb4.append("], isMainThread=[");
        sb4.append(AbstractC22676k.m65745e(Looper.myLooper(), Looper.getMainLooper()));
        sb4.append(']');
        return sb4.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean skipFurtherInitialization(Class<?> cls) {
        InitializerData initializerData = BaseMapboxInitializer.INSTANCE.getInitializersMap().get(cls);
        if (initializerData != null) {
            return initializerData.getState() == InitializerState.SUCCESS || initializerData.getState() == InitializerState.IN_PROGRESS;
        }
        return false;
    }
}
