package io.sentry.clientreport;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.HashMap;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.clientreport.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C20298f implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: w */
    public final String f76195w;

    /* JADX INFO: renamed from: x */
    public final String f76196x;

    /* JADX INFO: renamed from: y */
    public final Long f76197y;

    /* JADX INFO: renamed from: z */
    public HashMap f76198z;

    public C20298f(String str, String str2, Long l7) {
        this.f76195w = str;
        this.f76196x = str2;
        this.f76197y = l7;
    }

    /* JADX INFO: renamed from: a */
    public final String m56297a() {
        return this.f76196x;
    }

    /* JADX INFO: renamed from: b */
    public final Long m56298b() {
        return this.f76197y;
    }

    /* JADX INFO: renamed from: c */
    public final String m56299c() {
        return this.f76195w;
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("reason");
        c37199o.m119222b0(this.f76195w);
        c37199o.m119207K("category");
        c37199o.m119222b0(this.f76196x);
        c37199o.m119207K("quantity");
        c37199o.m119221a0(this.f76197y);
        HashMap map = this.f76198z;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC18489d0.m53385z(this.f76198z, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }

    public final String toString() {
        return "DiscardedEvent{reason='" + this.f76195w + "', category='" + this.f76196x + "', quantity=" + this.f76197y + '}';
    }
}
