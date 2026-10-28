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

/* JADX INFO: renamed from: io.sentry.protocol.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C20478g implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: w */
    public String f76680w;

    /* JADX INFO: renamed from: x */
    public boolean f76681x;

    /* JADX INFO: renamed from: y */
    public ConcurrentHashMap f76682y;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20478g.class == obj.getClass()) {
            C20478g c20478g = (C20478g) obj;
            if (AbstractC29125c.m88542s(this.f76680w, c20478g.f76680w) && AbstractC29125c.m88542s(Boolean.valueOf(this.f76681x), Boolean.valueOf(c20478g.f76681x))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f76680w, Boolean.valueOf(this.f76681x)});
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("flag");
        c37199o.m119222b0(this.f76680w);
        c37199o.m119207K("result");
        c37199o.m119223c0(this.f76681x);
        ConcurrentHashMap concurrentHashMap = this.f76682y;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76682y, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
