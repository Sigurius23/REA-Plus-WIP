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

/* JADX INFO: renamed from: io.sentry.protocol.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C20488l implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public Integer f76720E;

    /* JADX INFO: renamed from: F */
    public String f76721F;

    /* JADX INFO: renamed from: G */
    public Boolean f76722G;

    /* JADX INFO: renamed from: H */
    public String f76723H;

    /* JADX INFO: renamed from: I */
    public String f76724I;

    /* JADX INFO: renamed from: J */
    public ConcurrentHashMap f76725J;

    /* JADX INFO: renamed from: w */
    public String f76726w;

    /* JADX INFO: renamed from: x */
    public Integer f76727x;

    /* JADX INFO: renamed from: y */
    public String f76728y;

    /* JADX INFO: renamed from: z */
    public String f76729z;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20488l.class == obj.getClass()) {
            C20488l c20488l = (C20488l) obj;
            if (AbstractC29125c.m88542s(this.f76726w, c20488l.f76726w) && AbstractC29125c.m88542s(this.f76727x, c20488l.f76727x) && AbstractC29125c.m88542s(this.f76728y, c20488l.f76728y) && AbstractC29125c.m88542s(this.f76729z, c20488l.f76729z) && AbstractC29125c.m88542s(this.f76720E, c20488l.f76720E) && AbstractC29125c.m88542s(this.f76721F, c20488l.f76721F) && AbstractC29125c.m88542s(this.f76722G, c20488l.f76722G) && AbstractC29125c.m88542s(this.f76723H, c20488l.f76723H) && AbstractC29125c.m88542s(this.f76724I, c20488l.f76724I)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f76726w, this.f76727x, this.f76728y, this.f76729z, this.f76720E, this.f76721F, this.f76722G, this.f76723H, this.f76724I});
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        if (this.f76726w != null) {
            c37199o.m119207K("name");
            c37199o.m119222b0(this.f76726w);
        }
        if (this.f76727x != null) {
            c37199o.m119207K("id");
            c37199o.m119221a0(this.f76727x);
        }
        if (this.f76728y != null) {
            c37199o.m119207K("vendor_id");
            c37199o.m119222b0(this.f76728y);
        }
        if (this.f76729z != null) {
            c37199o.m119207K("vendor_name");
            c37199o.m119222b0(this.f76729z);
        }
        if (this.f76720E != null) {
            c37199o.m119207K("memory_size");
            c37199o.m119221a0(this.f76720E);
        }
        if (this.f76721F != null) {
            c37199o.m119207K("api_type");
            c37199o.m119222b0(this.f76721F);
        }
        if (this.f76722G != null) {
            c37199o.m119207K("multi_threaded_rendering");
            c37199o.m119220Z(this.f76722G);
        }
        if (this.f76723H != null) {
            c37199o.m119207K("version");
            c37199o.m119222b0(this.f76723H);
        }
        if (this.f76724I != null) {
            c37199o.m119207K("npot_support");
            c37199o.m119222b0(this.f76724I);
        }
        ConcurrentHashMap concurrentHashMap = this.f76725J;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76725J, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
