package io.sentry.protocol;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.util.concurrent.ConcurrentHashMap;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.protocol.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C20486k implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: w */
    public String f76704w;

    /* JADX INFO: renamed from: x */
    public String f76705x;

    /* JADX INFO: renamed from: y */
    public String f76706y;

    /* JADX INFO: renamed from: z */
    public ConcurrentHashMap f76707z;

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        if (this.f76704w != null) {
            c37199o.m119207K("city");
            c37199o.m119222b0(this.f76704w);
        }
        if (this.f76705x != null) {
            c37199o.m119207K("country_code");
            c37199o.m119222b0(this.f76705x);
        }
        if (this.f76706y != null) {
            c37199o.m119207K("region");
            c37199o.m119222b0(this.f76706y);
        }
        ConcurrentHashMap concurrentHashMap = this.f76707z;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76707z, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
