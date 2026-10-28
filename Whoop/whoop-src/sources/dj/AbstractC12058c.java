package dj;

import android.util.Log;
import java.util.HashSet;

/* JADX INFO: renamed from: dj.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12058c {

    /* JADX INFO: renamed from: a */
    public static final C12057b f39982a = new C12057b();

    /* JADX INFO: renamed from: a */
    public static void m33238a() {
        f39982a.getClass();
    }

    /* JADX INFO: renamed from: b */
    public static void m33239b(String str) {
        f39982a.getClass();
        HashSet hashSet = C12057b.f39981a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, null);
        hashSet.add(str);
    }

    /* JADX INFO: renamed from: c */
    public static void m33240c(String str, Throwable th3) {
        f39982a.getClass();
        HashSet hashSet = C12057b.f39981a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th3);
        hashSet.add(str);
    }
}
