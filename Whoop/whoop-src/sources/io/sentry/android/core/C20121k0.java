package io.sentry.android.core;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.transport.InterfaceC20558h;
import java.lang.ref.WeakReference;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.android.core.k0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20121k0 implements InterfaceC20558h {

    /* JADX INFO: renamed from: b */
    public static final C20121k0 f75590b = new C20121k0();

    /* JADX INFO: renamed from: a */
    public Object f75591a;

    public C20121k0() {
        this.f75591a = new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    /* JADX INFO: renamed from: a */
    public Boolean m56021a() {
        boolean z4;
        try {
            if (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) {
                z4 = true;
            } else {
                String str = Build.FINGERPRINT;
                if (str.startsWith("generic") || str.startsWith("unknown")) {
                    z4 = true;
                } else {
                    String str2 = Build.HARDWARE;
                    if (str2.contains("goldfish") || str2.contains("ranchu")) {
                        z4 = true;
                    } else {
                        String str3 = Build.MODEL;
                        if (str3.contains("google_sdk") || str3.contains("Emulator") || str3.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion")) {
                            z4 = true;
                        } else {
                            String str4 = Build.PRODUCT;
                            if (str4.contains("sdk_google") || str4.contains("google_sdk") || str4.contains("sdk") || str4.contains("sdk_x86") || str4.contains("vbox86p") || str4.contains("emulator") || str4.contains("simulator")) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                        }
                    }
                }
            }
            return Boolean.valueOf(z4);
        } catch (Throwable th3) {
            ((InterfaceC20602v0) this.f75591a).mo16060j(EnumC20436n5.ERROR, "Error checking whether application is running in an emulator.", th3);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m56022b(Activity activity) {
        WeakReference weakReference = (WeakReference) this.f75591a;
        if (weakReference == null || weakReference.get() != activity) {
            this.f75591a = new WeakReference(activity);
        }
    }

    @Override // io.sentry.transport.InterfaceC20558h
    public boolean isConnected() {
        int i13 = AbstractC20163v.f75759a[((C20513q6) this.f75591a).getConnectionStatusProvider().mo55992l().ordinal()];
        return i13 == 1 || i13 == 2 || i13 == 3;
    }

    public C20121k0(InterfaceC20602v0 interfaceC20602v0) {
        AbstractC29125c.m88510S(interfaceC20602v0, "The ILogger object is required.");
        this.f75591a = interfaceC20602v0;
    }
}
