package ac;

import android.os.Trace;

/* JADX INFO: renamed from: ac.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0735a {
    /* JADX INFO: renamed from: a */
    public static void m1789a(int i13, String str) {
        Trace.beginAsyncSection(str, i13);
    }

    /* JADX INFO: renamed from: b */
    public static void m1790b(int i13, String str) {
        Trace.endAsyncSection(str, i13);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1791c() {
        return Trace.isEnabled();
    }
}
