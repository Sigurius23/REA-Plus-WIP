package io.sentry;

import io.sentry.protocol.C20470c;
import io.sentry.protocol.C20473d0;
import io.sentry.protocol.C20503x;

/* JADX INFO: renamed from: io.sentry.v6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20608v6 implements InterfaceC20258b0 {

    /* JADX INFO: renamed from: w */
    public final String f77124w;

    /* JADX INFO: renamed from: x */
    public final String f77125x;

    public C20608v6() {
        String property = System.getProperty("java.version");
        String property2 = System.getProperty("java.vendor");
        this.f77124w = property;
        this.f77125x = property2;
    }

    /* JADX INFO: renamed from: a */
    public final void m56729a(AbstractC20519r4 abstractC20519r4) {
        C20470c c20470c = abstractC20519r4.f76884x;
        if (c20470c.mo56542h() == null) {
            c20470c.mo56554t(new C20503x());
        }
        C20503x c20503xMo56542h = c20470c.mo56542h();
        if (c20503xMo56542h != null && c20503xMo56542h.f76807w == null && c20503xMo56542h.f76808x == null) {
            c20503xMo56542h.f76807w = this.f77125x;
            c20503xMo56542h.f76808x = this.f77124w;
        }
    }

    @Override // io.sentry.InterfaceC20258b0
    /* JADX INFO: renamed from: h */
    public final C20321e5 mo55901h(C20321e5 c20321e5, C20337g0 c20337g0) {
        m56729a(c20321e5);
        return c20321e5;
    }

    @Override // io.sentry.InterfaceC20258b0
    /* JADX INFO: renamed from: i */
    public final C20473d0 mo55902i(C20473d0 c20473d0, C20337g0 c20337g0) {
        m56729a(c20473d0);
        return c20473d0;
    }
}
