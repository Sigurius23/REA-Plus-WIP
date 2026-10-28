package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1203c {

    /* JADX INFO: renamed from: a */
    public static final Class f5360a;

    /* JADX INFO: renamed from: b */
    public static final boolean f5361b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f5360a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f5361b = cls2 != null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3787a() {
        return (f5360a == null || f5361b) ? false : true;
    }
}
