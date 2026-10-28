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

/* JADX INFO: renamed from: io.sentry.protocol.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C20468b implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: w */
    public String f76610w;

    /* JADX INFO: renamed from: x */
    public String f76611x;

    /* JADX INFO: renamed from: y */
    public ConcurrentHashMap f76612y;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20468b.class == obj.getClass()) {
            C20468b c20468b = (C20468b) obj;
            if (AbstractC29125c.m88542s(this.f76610w, c20468b.f76610w) && AbstractC29125c.m88542s(this.f76611x, c20468b.f76611x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f76610w, this.f76611x});
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        if (this.f76610w != null) {
            c37199o.m119207K("name");
            c37199o.m119222b0(this.f76610w);
        }
        if (this.f76611x != null) {
            c37199o.m119207K("version");
            c37199o.m119222b0(this.f76611x);
        }
        ConcurrentHashMap concurrentHashMap = this.f76612y;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76612y, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
