package io.sentry.util;

/* JADX INFO: renamed from: io.sentry.util.i */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20587i {

    /* JADX INFO: renamed from: a */
    public static final boolean f77090a;

    /* JADX INFO: renamed from: b */
    public static final boolean f77091b;

    static {
        try {
            f77090a = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            f77090a = false;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                f77091b = Double.valueOf(property).doubleValue() >= 9.0d;
            } else {
                f77091b = false;
            }
        } catch (Throwable unused2) {
            f77091b = false;
        }
    }
}
