package io.sentry;

/* JADX INFO: renamed from: io.sentry.l4 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC20411l4 {
    /* JADX INFO: renamed from: y */
    static boolean m56625y(InterfaceC20602v0 interfaceC20602v0, String str) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        interfaceC20602v0.mo16066m(EnumC20436n5.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }

    /* JADX INFO: renamed from: t */
    C20402k4 mo1875t(InterfaceC20308d1 interfaceC20308d1, C20513q6 c20513q6);
}
