package androidx.health.platform.client.proto;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1443c {

    /* JADX INFO: renamed from: a */
    public static final Class f6023a;

    /* JADX INFO: renamed from: b */
    public static final boolean f6024b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f6023a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f6024b = cls2 != null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4578a() {
        return (f6023a == null || f6024b) ? false : true;
    }
}
