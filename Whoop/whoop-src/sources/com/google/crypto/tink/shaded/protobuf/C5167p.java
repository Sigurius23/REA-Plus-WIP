package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.p */
/* JADX INFO: loaded from: classes.dex */
public final class C5167p {

    /* JADX INFO: renamed from: a */
    public static volatile C5167p f21560a;

    /* JADX INFO: renamed from: b */
    public static final C5167p f21561b;

    static {
        C5167p c5167p = new C5167p();
        Map map = Collections.EMPTY_MAP;
        f21561b = c5167p;
    }

    /* JADX INFO: renamed from: a */
    public static C5167p m16298a() {
        C5167p c5167p;
        C5167p c5167p2 = f21560a;
        if (c5167p2 != null) {
            return c5167p2;
        }
        synchronized (C5167p.class) {
            try {
                c5167p = f21560a;
                if (c5167p == null) {
                    Class cls = AbstractC5164o.f21559a;
                    C5167p c5167p3 = null;
                    if (cls != null) {
                        try {
                            c5167p3 = (C5167p) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c5167p = c5167p3 != null ? c5167p3 : f21561b;
                    f21560a = c5167p;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return c5167p;
    }
}
