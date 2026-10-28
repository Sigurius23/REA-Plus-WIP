package p692zt;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import io.sentry.android.core.C20119j1;
import java.io.IOException;

/* JADX INFO: renamed from: zt.y */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC41121y implements Runnable {

    /* JADX INFO: renamed from: F */
    public static final Object f177258F = new Object();

    /* JADX INFO: renamed from: G */
    public static Boolean f177259G;

    /* JADX INFO: renamed from: H */
    public static Boolean f177260H;

    /* JADX INFO: renamed from: E */
    public final long f177261E;

    /* JADX INFO: renamed from: w */
    public final Context f177262w;

    /* JADX INFO: renamed from: x */
    public final C20119j1 f177263x;

    /* JADX INFO: renamed from: y */
    public final PowerManager.WakeLock f177264y;

    /* JADX INFO: renamed from: z */
    public final C41119w f177265z;

    public RunnableC41121y(C41119w c41119w, Context context, C20119j1 c20119j1, long j7) {
        this.f177265z = c41119w;
        this.f177262w = context;
        this.f177261E = j7;
        this.f177263x = c20119j1;
        this.f177264y = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m133490a(Context context) {
        boolean zBooleanValue;
        synchronized (f177258F) {
            try {
                Boolean bool = f177260H;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? m133491b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f177260H = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m133491b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z4 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z4 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z4;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m133492c(Context context) {
        boolean zBooleanValue;
        synchronized (f177258F) {
            try {
                Boolean bool = f177259G;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? m133491b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f177259G = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m133493d() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f177262w.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th3) {
            throw th3;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        C41119w c41119w = this.f177265z;
        Context context = this.f177262w;
        boolean zM133492c = m133492c(context);
        PowerManager.WakeLock wakeLock = this.f177264y;
        if (zM133492c) {
            wakeLock.acquire(AbstractC41102f.f177191a);
        }
        try {
            try {
                try {
                    c41119w.m133486d(true);
                    if (!this.f177263x.m56018e()) {
                        c41119w.m133486d(false);
                        if (m133492c(context)) {
                            try {
                                wakeLock.release();
                                return;
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (!m133490a(context) || m133493d()) {
                        if (c41119w.m133487e()) {
                            c41119w.m133486d(false);
                        } else {
                            c41119w.m133488f(this.f177261E);
                        }
                        if (m133492c(context)) {
                            wakeLock.release();
                            return;
                        }
                        return;
                    }
                    new C41120x(this, this).m133489a();
                    if (m133492c(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } catch (IOException e5) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e5.getMessage());
                    c41119w.m133486d(false);
                    if (m133492c(context)) {
                        wakeLock.release();
                    }
                }
            } catch (RuntimeException unused3) {
                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
            }
        } catch (Throwable th3) {
            if (m133492c(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th3;
        }
    }
}
