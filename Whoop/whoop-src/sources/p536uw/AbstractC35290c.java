package p536uw;

import java.sql.Date;
import java.sql.Timestamp;
import rw.C31851a;

/* JADX INFO: renamed from: uw.c */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC35290c {

    /* JADX INFO: renamed from: a */
    public static final boolean f150281a;

    /* JADX INFO: renamed from: b */
    public static final C35289b f150282b;

    /* JADX INFO: renamed from: c */
    public static final C35289b f150283c;

    /* JADX INFO: renamed from: d */
    public static final C31851a f150284d;

    /* JADX INFO: renamed from: e */
    public static final C31851a f150285e;

    /* JADX INFO: renamed from: f */
    public static final C31851a f150286f;

    static {
        boolean z4;
        try {
            Class.forName("java.sql.Date");
            z4 = true;
        } catch (ClassNotFoundException unused) {
            z4 = false;
        }
        f150281a = z4;
        if (z4) {
            f150282b = new C35289b(0, Date.class);
            f150283c = new C35289b(1, Timestamp.class);
            f150284d = C35288a.f150275c;
            f150285e = C35288a.f150276d;
            f150286f = C35288a.f150277e;
            return;
        }
        f150282b = null;
        f150283c = null;
        f150284d = null;
        f150285e = null;
        f150286f = null;
    }
}
