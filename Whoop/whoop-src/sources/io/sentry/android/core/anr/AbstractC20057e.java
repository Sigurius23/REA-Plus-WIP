package io.sentry.android.core.anr;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.sentry.android.core.anr.e */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20057e {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f75352a = new AtomicBoolean(true);

    /* JADX INFO: renamed from: b */
    public static final Object f75353b = new Object();

    /* JADX INFO: renamed from: a */
    public static boolean m55924a(File file) {
        File file2 = new File(file, "anr_profile_old");
        if (file2.exists()) {
            return file2.delete();
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static void m55925b(File file) {
        AtomicBoolean atomicBoolean = f75352a;
        if (atomicBoolean.get()) {
            synchronized (f75353b) {
                try {
                    if (atomicBoolean.get()) {
                        File file2 = new File(file, "anr_profile");
                        File file3 = new File(file, "anr_profile_old");
                        try {
                            file3.delete();
                        } catch (Throwable unused) {
                        }
                        try {
                            file2.renameTo(file3);
                        } catch (Throwable unused2) {
                        }
                        f75352a.set(false);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }
}
