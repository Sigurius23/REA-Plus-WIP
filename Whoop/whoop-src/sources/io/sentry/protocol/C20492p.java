package io.sentry.protocol;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import p581we.C37199o;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.protocol.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C20492p implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public String f76748E;

    /* JADX INFO: renamed from: F */
    public Boolean f76749F;

    /* JADX INFO: renamed from: G */
    public ConcurrentHashMap f76750G;

    /* JADX INFO: renamed from: w */
    public String f76751w;

    /* JADX INFO: renamed from: x */
    public String f76752x;

    /* JADX INFO: renamed from: y */
    public String f76753y;

    /* JADX INFO: renamed from: z */
    public String f76754z;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20492p.class == obj.getClass()) {
            C20492p c20492p = (C20492p) obj;
            if (AbstractC29125c.m88542s(this.f76751w, c20492p.f76751w) && AbstractC29125c.m88542s(this.f76752x, c20492p.f76752x) && AbstractC29125c.m88542s(this.f76753y, c20492p.f76753y) && AbstractC29125c.m88542s(this.f76754z, c20492p.f76754z) && AbstractC29125c.m88542s(this.f76748E, c20492p.f76748E) && AbstractC29125c.m88542s(this.f76749F, c20492p.f76749F)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f76751w, this.f76752x, this.f76753y, this.f76754z, this.f76748E, this.f76749F});
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        if (this.f76751w != null) {
            c37199o.m119207K("name");
            c37199o.m119222b0(this.f76751w);
        }
        if (this.f76752x != null) {
            c37199o.m119207K("version");
            c37199o.m119222b0(this.f76752x);
        }
        if (this.f76753y != null) {
            c37199o.m119207K("raw_description");
            c37199o.m119222b0(this.f76753y);
        }
        if (this.f76754z != null) {
            c37199o.m119207K("build");
            c37199o.m119222b0(this.f76754z);
        }
        if (this.f76748E != null) {
            c37199o.m119207K("kernel_version");
            c37199o.m119222b0(this.f76748E);
        }
        if (this.f76749F != null) {
            c37199o.m119207K("rooted");
            c37199o.m119220Z(this.f76749F);
        }
        ConcurrentHashMap concurrentHashMap = this.f76750G;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76750G, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
