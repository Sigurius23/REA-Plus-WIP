package io.sentry.protocol;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.protocol.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C20503x implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: w */
    public String f76807w;

    /* JADX INFO: renamed from: x */
    public String f76808x;

    /* JADX INFO: renamed from: y */
    public String f76809y;

    /* JADX INFO: renamed from: z */
    public ConcurrentHashMap f76810z;

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        if (this.f76807w != null) {
            c37199o.m119207K("name");
            c37199o.m119222b0(this.f76807w);
        }
        if (this.f76808x != null) {
            c37199o.m119207K("version");
            c37199o.m119222b0(this.f76808x);
        }
        if (this.f76809y != null) {
            c37199o.m119207K("raw_description");
            c37199o.m119222b0(this.f76809y);
        }
        ConcurrentHashMap concurrentHashMap = this.f76810z;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76810z, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
