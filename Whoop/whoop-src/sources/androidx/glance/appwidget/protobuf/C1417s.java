package androidx.glance.appwidget.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C1417s {

    /* JADX INFO: renamed from: a */
    public static volatile C1417s f5960a;

    /* JADX INFO: renamed from: b */
    public static final C1417s f5961b;

    static {
        C1417s c1417s = new C1417s();
        Map map = Collections.EMPTY_MAP;
        f5961b = c1417s;
    }

    /* JADX INFO: renamed from: a */
    public static C1417s m4512a() {
        C1417s c1417s;
        C1430y0 c1430y0 = C1430y0.f5993c;
        C1417s c1417s2 = f5960a;
        if (c1417s2 != null) {
            return c1417s2;
        }
        synchronized (C1417s.class) {
            try {
                c1417s = f5960a;
                if (c1417s == null) {
                    Class cls = AbstractC1415r.f5958a;
                    C1417s c1417s3 = null;
                    if (cls != null) {
                        try {
                            c1417s3 = (C1417s) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c1417s = c1417s3 != null ? c1417s3 : f5961b;
                    f5960a = c1417s;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return c1417s;
    }
}
