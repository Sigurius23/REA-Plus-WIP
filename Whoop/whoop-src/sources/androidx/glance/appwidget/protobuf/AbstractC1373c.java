package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1373c {

    /* JADX INFO: renamed from: a */
    public static final Class f5871a;

    /* JADX INFO: renamed from: b */
    public static final boolean f5872b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f5871a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f5872b = cls2 != null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4297a() {
        return (f5871a == null || f5872b) ? false : true;
    }
}
