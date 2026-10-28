package io.sentry.protocol;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import p098dt.AbstractC12350b;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.protocol.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20475e0 implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: w */
    public String[] f76641w;

    /* JADX INFO: renamed from: x */
    public ConcurrentHashMap f76642x;

    public C20475e0(C20475e0 c20475e0) {
        this.f76641w = c20475e0.f76641w;
        this.f76642x = AbstractC12350b.m34553B(c20475e0.f76642x);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20475e0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f76641w, ((C20475e0) obj).f76641w);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f76641w);
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        if (this.f76641w != null) {
            c37199o.m119207K("active_profiles");
            c37199o.m119219Y(interfaceC20602v0, this.f76641w);
        }
        ConcurrentHashMap concurrentHashMap = this.f76642x;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76642x, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
