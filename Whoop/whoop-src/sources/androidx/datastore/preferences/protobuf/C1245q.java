package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1245q {

    /* JADX INFO: renamed from: a */
    public static volatile C1245q f5451a;

    /* JADX INFO: renamed from: b */
    public static final C1245q f5452b;

    static {
        C1245q c1245q = new C1245q();
        Map map = Collections.EMPTY_MAP;
        f5452b = c1245q;
    }

    /* JADX INFO: renamed from: a */
    public static C1245q m3969a() {
        C1245q c1245q;
        C1264w0 c1264w0 = C1264w0.f5502c;
        C1245q c1245q2 = f5451a;
        if (c1245q2 != null) {
            return c1245q2;
        }
        synchronized (C1245q.class) {
            try {
                c1245q = f5451a;
                if (c1245q == null) {
                    Class cls = AbstractC1242p.f5448a;
                    C1245q c1245q3 = null;
                    if (cls != null) {
                        try {
                            c1245q3 = (C1245q) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c1245q = c1245q3 != null ? c1245q3 : f5452b;
                    f5451a = c1245q;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return c1245q;
    }
}
