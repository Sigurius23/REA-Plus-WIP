package p218ic;

import android.util.Log;

/* JADX INFO: renamed from: ic.w */
/* JADX INFO: loaded from: classes.dex */
public final class C18389w {

    /* JADX INFO: renamed from: b */
    public static final Object f71554b = new Object();

    /* JADX INFO: renamed from: c */
    public static volatile C18389w f71555c;

    /* JADX INFO: renamed from: a */
    public final int f71556a;

    public C18389w(int i13) {
        this.f71556a = i13;
    }

    /* JADX INFO: renamed from: d */
    public static C18389w m52886d() {
        C18389w c18389w;
        synchronized (f71554b) {
            try {
                if (f71555c == null) {
                    f71555c = new C18389w(3);
                }
                c18389w = f71555c;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return c18389w;
    }

    /* JADX INFO: renamed from: f */
    public static String m52887f(String str) {
        int length = str.length();
        StringBuilder sb4 = new StringBuilder(23);
        sb4.append("WM-");
        if (length >= 20) {
            sb4.append(str.substring(0, 20));
        } else {
            sb4.append(str);
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: a */
    public final void m52888a(String str, String str2) {
        if (this.f71556a <= 3) {
            Log.d(str, str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m52889b(String str, String str2) {
        if (this.f71556a <= 6) {
            Log.e(str, str2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m52890c(String str, String str2, Throwable th3) {
        if (this.f71556a <= 6) {
            Log.e(str, str2, th3);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m52891e(String str, String str2) {
        if (this.f71556a <= 4) {
            Log.i(str, str2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m52892g(String str, String str2) {
        if (this.f71556a <= 5) {
            Log.w(str, str2);
        }
    }
}
