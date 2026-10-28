package io.sentry.protocol;

import androidx.core.app.NotificationCompat;
import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import p581we.C37199o;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.protocol.h0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20481h0 implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public String f76683E;

    /* JADX INFO: renamed from: F */
    public C20486k f76684F;

    /* JADX INFO: renamed from: G */
    public ConcurrentHashMap f76685G;

    /* JADX INFO: renamed from: H */
    public ConcurrentHashMap f76686H;

    /* JADX INFO: renamed from: w */
    public String f76687w;

    /* JADX INFO: renamed from: x */
    public String f76688x;

    /* JADX INFO: renamed from: y */
    public String f76689y;

    /* JADX INFO: renamed from: z */
    public String f76690z;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20481h0.class == obj.getClass()) {
            C20481h0 c20481h0 = (C20481h0) obj;
            if (AbstractC29125c.m88542s(this.f76687w, c20481h0.f76687w) && AbstractC29125c.m88542s(this.f76688x, c20481h0.f76688x) && AbstractC29125c.m88542s(this.f76689y, c20481h0.f76689y) && AbstractC29125c.m88542s(this.f76690z, c20481h0.f76690z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f76687w, this.f76688x, this.f76689y, this.f76690z});
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        if (this.f76687w != null) {
            c37199o.m119207K(NotificationCompat.CATEGORY_EMAIL);
            c37199o.m119222b0(this.f76687w);
        }
        if (this.f76688x != null) {
            c37199o.m119207K("id");
            c37199o.m119222b0(this.f76688x);
        }
        if (this.f76689y != null) {
            c37199o.m119207K("username");
            c37199o.m119222b0(this.f76689y);
        }
        if (this.f76690z != null) {
            c37199o.m119207K("ip_address");
            c37199o.m119222b0(this.f76690z);
        }
        if (this.f76683E != null) {
            c37199o.m119207K("name");
            c37199o.m119222b0(this.f76683E);
        }
        if (this.f76684F != null) {
            c37199o.m119207K("geo");
            this.f76684F.serialize(c37199o, interfaceC20602v0);
        }
        if (this.f76685G != null) {
            c37199o.m119207K("data");
            c37199o.m119219Y(interfaceC20602v0, this.f76685G);
        }
        ConcurrentHashMap concurrentHashMap = this.f76686H;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76686H, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
