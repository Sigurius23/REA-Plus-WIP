package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.android.core.util.C20162a;
import p211i5.C18090c;

/* JADX INFO: renamed from: io.sentry.android.core.j0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20118j0 {

    /* JADX INFO: renamed from: a */
    public static final C20162a f75579a = new C20162a(new C18090c(17));

    /* JADX INFO: renamed from: b */
    public static final C20162a f75580b = new C20162a(new C18090c(18));

    /* JADX INFO: renamed from: c */
    public static final C20162a f75581c = new C20162a(new C18090c(19));

    /* JADX INFO: renamed from: d */
    public static final C20162a f75582d = new C20162a(new C18090c(20));

    /* JADX INFO: renamed from: e */
    public static final C20162a f75583e = new C20162a(new C18090c(21));

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ApplicationInfo m56007a(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ PackageInfo m56008b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m56009c(InterfaceC20602v0 interfaceC20602v0) {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable th3) {
            interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Error getting device family.", th3);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static ActivityManager.MemoryInfo m56010d(Context context, InterfaceC20602v0 interfaceC20602v0) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            interfaceC20602v0.mo16066m(EnumC20436n5.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th3) {
            interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Error getting MemoryInfo.", th3);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static PackageInfo m56011e(Context context, InterfaceC20602v0 interfaceC20602v0, C20121k0 c20121k0) {
        try {
            c20121k0.getClass();
            return Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(4096)) : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
        } catch (Throwable th3) {
            interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Error getting package info.", th3);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static PackageInfo m56012f(Context context, C20121k0 c20121k0) {
        c20121k0.getClass();
        return Build.VERSION.SDK_INT >= 33 ? (PackageInfo) f75579a.m56072b(context) : (PackageInfo) f75580b.m56072b(context);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m56013g() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance == 100;
        } catch (Throwable unused) {
            return false;
        }
    }
}
