package p529uo;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: uo.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC35135w {

    /* JADX INFO: renamed from: a */
    public static final Object f149082a = new Object();

    /* JADX INFO: renamed from: b */
    public static boolean f149083b;

    /* JADX INFO: renamed from: c */
    public static int f149084c;

    /* JADX INFO: renamed from: a */
    public static void m111089a(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m111090b(boolean z4, String str) {
        if (!z4) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m111091c(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb4 = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            AbstractC11266d.m30444B(sb4, "Must be called on ", name2, " thread, but got ", name);
            sb4.append(".");
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m111092d(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m111093e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m111094f(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m111095g(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m111096h(String str, boolean z4) {
        if (!z4) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m111097i(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
