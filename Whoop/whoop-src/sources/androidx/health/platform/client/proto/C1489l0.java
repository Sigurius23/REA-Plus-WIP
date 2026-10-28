package androidx.health.platform.client.proto;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.l0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1489l0 {

    /* JADX INFO: renamed from: a */
    public static volatile C1489l0 f6065a;

    /* JADX INFO: renamed from: b */
    public static final C1489l0 f6066b;

    static {
        C1489l0 c1489l0 = new C1489l0();
        Map map = Collections.EMPTY_MAP;
        f6066b = c1489l0;
    }

    /* JADX INFO: renamed from: a */
    public static C1489l0 m4695a() {
        C1489l0 c1489l0;
        C1489l0 c1489l1 = f6065a;
        if (c1489l1 != null) {
            return c1489l1;
        }
        synchronized (C1489l0.class) {
            try {
                c1489l0 = f6065a;
                if (c1489l0 == null) {
                    Class cls = AbstractC1484k0.f6062a;
                    C1489l0 c1489l2 = null;
                    if (cls != null) {
                        try {
                            c1489l2 = (C1489l0) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c1489l0 = c1489l2 != null ? c1489l2 : f6066b;
                    f6065a = c1489l0;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return c1489l0;
    }
}
