package io.sentry;

import ih0.AbstractC18489d0;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import p581we.C37199o;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.t3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20547t3 implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public Long f76999E;

    /* JADX INFO: renamed from: F */
    public Long f77000F;

    /* JADX INFO: renamed from: G */
    public Long f77001G;

    /* JADX INFO: renamed from: H */
    public ConcurrentHashMap f77002H;

    /* JADX INFO: renamed from: w */
    public String f77003w;

    /* JADX INFO: renamed from: x */
    public String f77004x;

    /* JADX INFO: renamed from: y */
    public String f77005y;

    /* JADX INFO: renamed from: z */
    public Long f77006z;

    public C20547t3(InterfaceC20432n1 interfaceC20432n1, Long l7, Long l12) {
        this.f77003w = interfaceC20432n1.mo56512h().toString();
        this.f77004x = interfaceC20432n1.mo56462t().f76321w.toString();
        this.f77005y = interfaceC20432n1.getName().isEmpty() ? "unknown" : interfaceC20432n1.getName();
        this.f77006z = l7;
        this.f77000F = l12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20547t3.class != obj.getClass()) {
            return false;
        }
        C20547t3 c20547t3 = (C20547t3) obj;
        return this.f77003w.equals(c20547t3.f77003w) && this.f77004x.equals(c20547t3.f77004x) && this.f77005y.equals(c20547t3.f77005y) && this.f77006z.equals(c20547t3.f77006z) && this.f77000F.equals(c20547t3.f77000F) && AbstractC29125c.m88542s(this.f77001G, c20547t3.f77001G) && AbstractC29125c.m88542s(this.f76999E, c20547t3.f76999E) && AbstractC29125c.m88542s(this.f77002H, c20547t3.f77002H);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f77003w, this.f77004x, this.f77005y, this.f77006z, this.f76999E, this.f77000F, this.f77001G, this.f77002H});
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("id");
        c37199o.m119219Y(interfaceC20602v0, this.f77003w);
        c37199o.m119207K("trace_id");
        c37199o.m119219Y(interfaceC20602v0, this.f77004x);
        c37199o.m119207K("name");
        c37199o.m119219Y(interfaceC20602v0, this.f77005y);
        c37199o.m119207K("relative_start_ns");
        c37199o.m119219Y(interfaceC20602v0, this.f77006z);
        c37199o.m119207K("relative_end_ns");
        c37199o.m119219Y(interfaceC20602v0, this.f76999E);
        c37199o.m119207K("relative_cpu_start_ms");
        c37199o.m119219Y(interfaceC20602v0, this.f77000F);
        c37199o.m119207K("relative_cpu_end_ms");
        c37199o.m119219Y(interfaceC20602v0, this.f77001G);
        ConcurrentHashMap concurrentHashMap = this.f77002H;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f77002H, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
